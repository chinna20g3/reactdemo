import React, { useState } from 'react';
import { Grid, Card, CardMedia, Typography, Box } from '@mui/material';
import { useNavigate } from 'react-router-dom';

// Example images (Replace with your actual image paths)
import image1 from '../../src/assets/image1.jpg';
import image2 from '../../src/assets/image2.jpg';
import image3 from '../../src/assets/image3.jpg';
import image4 from '../../src/assets/image4.jpg';
import image5 from '../../src/assets/image5.jpg';
import image6 from '../../src/assets/image6.jpg';
import image7 from '../../src/assets/image7.jpg';
import image8 from '../../src/assets/image8.jpg';

const colleges = [
  { title: 'Kristu Jayanti College Autonomous', image: image1 },
  { title: 'Presidency University', image: image2 },
  { title: 'Nitte Education Trust', image: image3 },
  { title: 'Dayananda Sagar Institutions', image: image4 },
  { title: 'St Joseph’s University', image: image5 },
  { title: 'BMS Group Of Institutions', image: image6 },
  { title: 'AMC College', image: image7 },
  { title: 'Nagarjuna Group Of Institutions', image: image8 },
];

const FeaturedColleges = () => {
  const [zoomed, setZoomed] = useState(null);

  const handleZoom = (index) => {
    setZoomed(index === zoomed ? null : index);
  };

  const navigate = useNavigate();
  const handleMouseOver = (index) => {
    // Add your zoom or additional details logic here
    console.log(`Mouse over card: ${index}`);
  };
  const handleCardClick = (collegeId) => {
    navigate(`/information/${collegeId}`);
  };

  return (
    <Box sx={{ backgroundColor: '#cdd0d4', padding: '20px 0' }}>
      <Grid container direction="column" alignItems="center" sx={{ marginBottom: '20px' }}>
        <Typography variant="h5" component="h3" align="center" gutterBottom>
          Featured Colleges
        </Typography>
        <Typography variant="body2" component="h6" align="center" gutterBottom>
          Explore Bangalore's Premier Institutions!
        </Typography>
      </Grid>
      <Box sx={{ padding: '0 20px' }}>
        <Grid container spacing={2} justifyContent="center">
          {colleges.map((college, index) => (
            <Grid item key={index} xs={12} sm={6} md={3}>
              <Card 
                sx={{ 
                  height: '100%', 
                  position: 'relative', 
                  overflow: 'hidden', 
                  borderRadius: '10px', 
                  cursor: 'pointer',
                
                }}
                onMouseOver={() => handleZoom(index)}
                onClick={() => handleCardClick(college.id)}
              >
                <CardMedia
                  component="img"
                  height="100%"
                  image={college.image}
                  alt={college.title}
                  sx={{ filter: 'brightness(50%)' ,
                      transition: 'transform 0.1s ease-in-out',
                  transform: zoomed === index ? 'scale(1.1)' : 'scale(1)'
                  }}
                  
                />
                <Box
                  sx={{
                    position: 'absolute',
                    top: 0,
                    left: 0,
                    right: 0,
                    bottom: 0,
                    display: 'flex',
                    alignItems: 'center',
                    justifyContent: 'center',
                    color: 'white',
                    fontWeight: 'bold',
                    fontSize: '16px',
                    padding: '10px',
                    textAlign: 'center',
                  }}
                >
                  {college.title}
                </Box>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Box>
    </Box>
  );
};

export default FeaturedColleges;
