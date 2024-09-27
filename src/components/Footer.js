import React from 'react';
import { Grid, Typography, Box, TextField, Button, MenuItem, Select } from '@mui/material';
import EmailIcon from '@mui/icons-material/Email';
import PhoneIcon from '@mui/icons-material/Phone';
import LocationOnIcon from '@mui/icons-material/LocationOn';
import LinkedInIcon from '@mui/icons-material/LinkedIn';
import FacebookIcon from '@mui/icons-material/Facebook';
import InstagramIcon from '@mui/icons-material/Instagram';
import TwitterIcon from '@mui/icons-material/Twitter';
import YouTubeIcon from '@mui/icons-material/YouTube';
import WhatsAppIcon from '@mui/icons-material/WhatsApp';

const Footer = () => {
  return (
    <Box sx={{ backgroundColor: '#1a1b44', color: '#fff', padding: '0', marginTop: '80px' }}>
     
      <Box sx={{ backgroundColor: '#f5f5f5', color: '#000', padding: '40px 0', textAlign: 'center', px: 3 }}>
        <Typography variant="h5" component="h3" sx={{ marginBottom: '10px' }}>
          Subscribe to Our Newsletter
        </Typography>
        <Typography variant="body1" component="p" sx={{ marginBottom: '20px' }}>
          Subscribe to Our Newsletter for Exclusive Updates and Opportunities
        </Typography>
        <Grid container justifyContent="center" spacing={2}>
          <Grid item xs={12} sm={3}>
            <TextField 
              fullWidth 
              placeholder="Enter your email" 
              variant="outlined" 
              size="small" 
              sx={{ backgroundColor: '#fff' }} 
            />
          </Grid>
          <Grid item xs={12} sm={3}>
            <TextField 
              fullWidth 
              placeholder="Enter your phone number" 
              variant="outlined" 
              size="small" 
              sx={{ backgroundColor: '#fff' }} 
            />
          </Grid>
          <Grid item xs={12} sm={3}>
            <Select 
              fullWidth 
              defaultValue="" 
              displayEmpty 
              variant="outlined" 
              size="small" 
              sx={{ backgroundColor: '#fff' }}
            >
              <MenuItem value="" disabled>Select Course</MenuItem>
              <MenuItem value="Medical">Medical</MenuItem>
              <MenuItem value="Paramedical">Paramedical</MenuItem>
              <MenuItem value="Engineering">Engineering</MenuItem>
              <MenuItem value="Pharmacy">Pharmacy</MenuItem>
              <MenuItem value="Nursing">Nursing</MenuItem>
              <MenuItem value="Management">Management</MenuItem>
              <MenuItem value="Diploma">Diploma</MenuItem>
              <MenuItem value="Science">Science</MenuItem>
              <MenuItem value="Law">Law</MenuItem>
            </Select>
          </Grid>
          <Grid item xs={12} sm={3}>
            <Button 
              fullWidth 
              variant="contained" 
              color="primary" 
              sx={{ height: '100%' }}
            >
              SUBSCRIBE NOW
            </Button>
          </Grid>
        </Grid>
      </Box>

      {/* Main Footer Content */}
      <Grid container spacing={4} justifyContent="center" sx={{ padding: { xs: '20px 20px', md: '40px 40px' } }}>
        <Grid item xs={12} sm={2}>
          <Typography variant="h6">GetMyCollege</Typography>
          <Typography variant="body2" sx={{ marginTop: '10px' }}>
            Fueling Ambitions, Connecting Futures: Navigate your educational journey with confidence, as our user-friendly platform bridges the gap between aspirations and accomplishments. Join our community today and embark on a path to academic success.
          </Typography>
        </Grid>
        <Grid item xs={6} sm={2}>
          <Typography variant="h6">Top Colleges</Typography>
          <Typography variant="body2" sx={{ marginTop: '10px' }}>
            AMC<br/>
            DAYANANDA SAGAR<br/>
            ADITYA<br/>
            AIMS<br/>
            ALLIANCE<br/>
            ATRIA<br/>
          </Typography>
        </Grid>
        <Grid item xs={6} sm={2}>
          <Typography variant="h6">Top University</Typography>
          <Typography variant="body2" sx={{ marginTop: '10px' }}>
            MEDICAL<br/>
            PARA MEDICAL<br/>
            ENGINEERING<br/>
            NURSING<br/>
            LLB<br/>
            SCIENCE<br/>
          </Typography>
        </Grid>
        <Grid item xs={6} sm={2}>
          <Typography variant="h6">Study Abroad</Typography>
          <Typography variant="body2" sx={{ marginTop: '10px' }}>
            CANADA<br/>
            SWEDEN<br/>
            AUSTRALIA<br/>
            GERMANY<br/>
            UK<br/>
            USA<br/>
          </Typography>
        </Grid>
        <Grid item xs={6} sm={2}>
          <Typography variant="h6">Contact Us</Typography>
          <Typography variant="body2" sx={{ marginTop: '10px', display: 'flex', flexDirection: 'column', alignItems: 'start' }}>
            <Box sx={{ display: 'flex', alignItems: 'center', marginBottom: '10px' }}>
              <EmailIcon sx={{ marginRight: '10px' }} /> INFO@GETMYCOLLEGE.COM
            </Box>
            <Box sx={{ display: 'flex', alignItems: 'center', marginBottom: '10px' }}>
              <PhoneIcon sx={{ marginRight: '10px' }} /> +91 8867325152
            </Box>
            <Box sx={{ display: 'flex', alignItems: 'center' }}>
              <LocationOnIcon sx={{ marginRight: '10px' }} /> GETMYCOLLEGE, BASAVANAGUDI CIRCLE, BANGALORE, KARNATAKA-560004
            </Box>
          </Typography>
        </Grid>
      </Grid>

      {/* Other Links and App Download Section */}
      <Grid container spacing={4} justifyContent="space-between" alignItems="center" sx={{ padding: { xs: '20px 20px', md: '20px 40px' }, borderTop: '1px solid #fff',marginTop:'5px' }}>
        <Grid item xs={12} sm={6}>
          <Typography variant="h6" sx={{ marginBottom: '10px' }}>Other Links</Typography>
          <Box sx={{ display: 'flex', flexWrap: 'wrap', gap: 2 }}>
            <Typography variant="body2" sx={{ margin: '0 10px' }}>About GetMyCollege</Typography>
            <Typography variant="body2" sx={{ margin: '0 10px' }}>Contact Us</Typography>
            <Typography variant="body2" sx={{ margin: '0 10px' }}>Privacy Policy</Typography>
            <Typography variant="body2" sx={{ margin: '0 10px' }}>Terms & Conditions</Typography>
            <Typography variant="body2" sx={{ margin: '0 10px' }}>Careers</Typography>
          </Box>
        </Grid>
        <Grid item xs={12} sm={6} sx={{ textAlign: 'right' }}>
          <Typography variant="body2" sx={{ marginBottom: '10px' }}>
            Download the GetMyCollege App on
          </Typography>
          <Button variant="contained" color="success" sx={{ marginRight: '10px' }}>
            Get it on Google Play
          </Button>
          <Button variant="contained" color="primary">
            Download on the App Store
          </Button>
        </Grid>
      </Grid>

      {/* Footer Bottom */}
      <Box sx={{ display: 'flex', flexDirection: { xs: 'column', md: 'row' }, justifyContent: 'space-between', alignItems: 'center', padding: '10px 40px', backgroundColor: '#101039', textAlign: 'center' }}>
        <Typography variant="body2" sx={{ mb: { xs: 1, md: 0 } }}>
          &copy; 2023 - GetMyCollege.com All Rights Reserved.
        </Typography>
        <Box sx={{ display: 'flex', justifyContent: 'center' }}>
          <LinkedInIcon sx={{ margin: '0 5px' }} />
          <FacebookIcon sx={{ margin: '0 5px' }} />
          <InstagramIcon sx={{ margin: '0 5px' }} />
          <TwitterIcon sx={{ margin: '0 5px' }} />
          <YouTubeIcon sx={{ margin: '0 5px' }} />
          <WhatsAppIcon sx={{ margin: '0 5px' }} />
        </Box>
      </Box>
    </Box>
  );
};

export default Footer;
