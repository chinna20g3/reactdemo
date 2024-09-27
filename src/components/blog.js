import React from 'react';
import { Grid, Card, CardContent, Typography, Button, Box } from '@mui/material';

// Example images (Replace with your actual image paths)
import bookImage1 from '../../src/assets/book1.jpg'; // Replace with your actual image path
import bookImage2 from '../../src/assets/book2.webp'; // Replace with your actual image path

const blogs = [
  {
    title: 'Get College Admission with Easy',
    description: 'Discover how you can easily get admission to top colleges.',
    buttonText: 'Get Colleges',
    image: bookImage1,
    backgroundColor: '#e3f2fd',
  },
  {
    title: 'Career on Higher Education',
    description: 'Explore various career opportunities in higher education.',
    buttonText: 'View Courses',
    image: bookImage2,
    backgroundColor: '#ffecb3',
  },
];

const BlogSection = () => {
  return (
    <Box sx={{ margin: '20px 0' }}>
      <Typography variant="h6" component="h5" sx={{ textAlign: 'center', marginBottom: 1 }}>
        Articles from Latest Blogs
      </Typography>
      <Typography variant="body2" component="h6" sx={{ textAlign: 'center', marginBottom: 2 }}>
        Discover Bangalore's Educational Brilliance - Your Gateway to Top Colleges and Beyond
      </Typography>
      <Grid container spacing={10} justifyContent="center">
        {blogs.map((blog, index) => (
          <Grid item key={index} xs={10} sm={6} md={4}>
            <Card sx={{ padding: 1, backgroundColor: blog.backgroundColor }}>
              <CardContent>
                <Typography variant="caption" component="p">
                  Latest
                </Typography>
                <Typography 
                  variant="subtitle2" 
                  component="h5" 
                  gutterBottom 
                  sx={{ 
                    overflow: 'hidden', 
                    whiteSpace: 'nowrap', 
                    textOverflow: 'ellipsis' 
                  }}
                >
                  {blog.title}
                </Typography>
                <Typography 
                  variant="body2" 
                  component="p" 
                  sx={{ 
                    overflow: 'hidden', 
                    whiteSpace: 'nowrap', 
                    textOverflow: 'ellipsis' 
                  }}
                >
                  {blog.description}
                </Typography>
                <img 
                  src={blog.image} 
                  alt={blog.title} 
                  style={{ 
                    width: '100%', 
                    height: '100px', 
                    objectFit: 'cover', 
                    marginTop: 8 
                  }} 
                />
                <Button 
                  variant="contained" 
                  sx={{ 
                    marginTop: 1, 
                    backgroundColor: '#3f51b5', 
                    color: '#fff', 
                    fontSize: '0.75rem',
                    '&:hover': { backgroundColor: '#303f9f' } 
                  }}
                >
                  {blog.buttonText}
                </Button>
              </CardContent>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Box>
  );
};

export default BlogSection;
