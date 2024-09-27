import React from 'react';
import { Grid, Button, Box, Typography } from '@mui/material';
import PhoneIcon from '@mui/icons-material/Phone';
import EmailIcon from '@mui/icons-material/Email';

export const Header = () => {
  return (
    <Box sx={{ backgroundColor: '#212162', color: 'white', padding: '5px 10px' }}>
      <Grid container alignItems="center" justifyContent="space-between">
        <Grid item xs={12} sm="auto" sx={{ display: 'flex', alignItems: 'center' }}>
          <PhoneIcon sx={{ marginRight: '5px', fontSize: '16px' }} />
          <Typography variant="body2" sx={{ fontSize: '12px' }}>+91 8867325152</Typography>
          <Typography variant="body2" sx={{ margin: '0 10px', fontSize: '14px' }}>|</Typography>
          <EmailIcon sx={{ marginRight: '5px', fontSize: '16px' }} />
          <Typography variant="body2" sx={{ fontSize: '12px' }}>info@getmycollege.com</Typography>
        </Grid>
        <Grid item xs={12} sm="auto" sx={{ display: 'flex', justifyContent: 'flex-end', flexGrow: 1, mt: { xs: 1, sm: 0 } }}>
          <Button
            variant="contained"
            sx={{
              backgroundColor: '#fff',
              color: '#212162',
              marginRight: '10px',
              padding: '5px 10px',
              fontSize: '12px',
              minWidth: '60px'
            }}
          >
            SIGN IN
          </Button>
          <Button
            variant="outlined"
            sx={{
              color: '#fff',
              borderColor: '#fff',
              padding: '5px 10px',
              fontSize: '12px',
              minWidth: '60px'
            }}
          >
            SIGN UP
          </Button>
        </Grid>
      </Grid>
    </Box>
  );
};

export default Header;
