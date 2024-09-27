import React from 'react';
import { Grid, Card, CardMedia, CardContent, Typography, Button, Box } from '@mui/material';
import { useNavigate } from 'react-router-dom';
// Example images
import image1 from '../../src/assets/image1.jpg'; // Replace with your actual image path
import image2 from '../../src/assets/image2.jpg'; // Replace with your actual image path
import image3 from '../../src/assets/image3.jpg'; // Replace with your actual image path
import image4 from '../../src/assets/image4.jpg'; // Replace with your actual image path
import image5 from '../../src/assets/image5.jpg'; // Replace with your actual image path
import image6 from '../../src/assets/image6.jpg'; // Replace with your actual image path
import image7 from '../../src/assets/image7.jpg'; // Replace with your actual image path
import image8 from '../../src/assets/image8.jpg'; // Replace with your actual image path

const colleges = [
  { title: 'AMC Engineering College', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, Bannerghatta Road', image: image1 },
  { title: 'AMC Management College', university: 'Bangalore University', location: 'Bangalore, Bannerghatta Road', image: image2 },
  { title: 'Cambridge Degree College', university: 'Bengaluru North University', location: 'Bangalore, Krishnarajapuram', image: image3 },
  { title: 'Cambridge Institute of Technology', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, Krishnarajapuram', image: image4 },
  { title: 'BMS College of Engineering', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, Basavanagudi', image: image5 },
  { title: 'Ramaiah Institute of Technology', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, MSR Nagar', image: image6 },
  { title: 'City Engineering College', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, Doddakallasandra', image: image7 },
  { title: 'Atria Institute of Technology', university: 'Visvesvaraya Technological University (VTU)', location: 'Bangalore, Hebbal', image: image8 },
];

const TopColleges = () => {
  const navigate = useNavigate();
  const handleMouseOver = (index) => {
    // Add your zoom or additional details logic here
    console.log(`Mouse over card: ${index}`);
  };
  const handleCardClick = (collegeId) => {
    navigate(`/colleges/${collegeId}`);
  };

  return (
    <Box sx={{ backgroundColor: '#cdd0d4', padding: '20px 0' }}>
      <Grid container direction="column" alignItems="center" sx={{ margin: '10px 0', marginTop: '40px' }}>
        <Typography variant="h5" component="h3" align="center" gutterBottom>
          Top Colleges in Bangalore
        </Typography>
        <Typography variant="body2" component="h6" align="center" gutterBottom>
          Discover Bangalore's Premier Educational Institutions - Your Guide to Top Colleges in the Silicon Valley of India
        </Typography>
      </Grid>
      <Box sx={{ padding: '5px' }}>
        <Grid container spacing={2} justifyContent="center">
          {colleges.map((college, index) => (
            <Grid item key={index} xs={12} sm={6} md={3}>
              <Card 
                sx={{ 
                  height: '100%', 
                  display: 'flex', 
                  flexDirection: 'column', 
                  transition: 'transform 0.2s, box-shadow 0.3s', 
                  '&:hover': {
                    transform: 'scale(1.05)',
                    boxShadow: 6,
                  },
                }}
                onMouseOver={() => handleMouseOver(index)}
                onClick={() => handleCardClick(college.id)}
              >
                <CardMedia
                  component="img"
                  height="140"
                  image={college.image}
                  alt={college.title}
                />
                <CardContent sx={{ flexGrow: 1 }}>
                  <Typography variant="h6" component="div" gutterBottom>
                    {college.title}
                  </Typography>
                  <Typography variant="body2" color="textSecondary" gutterBottom>
                    {college.university}
                  </Typography>
                  <Typography variant="body2" color="textSecondary">
                    <span role="img" aria-label="location">📍</span> {college.location}
                  </Typography>
                  <Box sx={{ display: 'flex', justifyContent: 'space-between', marginTop: '10px' }}>
                    <Button 
                      variant="contained" 
                      sx={{ 
                        backgroundColor: '#e0e0e0', 
                        color: '#000', 
                        fontSize: '10px', 
                        minWidth: '80px' 
                      }}
                    >
                      SCHOLARSHIP
                    </Button>
                    <Button 
                      variant="contained" 
                      sx={{ 
                        backgroundColor: '#3f51b5', 
                        color: '#fff', 
                        fontSize: '10px', 
                        minWidth: '80px' 
                      }}
                    >
                      APPLY NOW
                    </Button>
                  </Box>
                </CardContent>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Box>
      <Box sx={{ textAlign: 'center', marginTop: '20px' }}>
        <Button 
          variant="outlined" 
          sx={{ 
            color: 'white', 
            borderColor: '#3f51b5', 
            padding: '10px 20px', 
            fontSize: '14px',
            minWidth: '120px',
            backgroundColor: '#3f51b5',
            '&:hover': {
              backgroundColor: '#303f9f',
            }
          }}
        >
          EXPLORE
        </Button>
      </Box>
    </Box>
  );
};

export default TopColleges;
