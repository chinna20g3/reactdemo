import { Grid, InputAdornment, TextField, IconButton } from '@mui/material';
import SearchIcon from '@mui/icons-material/Search';
import React from 'react';

const Searchbar = () => {
  const handleSubmit = (event) => {
    event.preventDefault();
    // Handle search logic here if needed
  };

  return (
    <Grid container justifyContent="center" marginBottom="90px">
      <Grid item xs={10} md={8} lg={12}>
        <form onSubmit={handleSubmit} style={{ display: 'flex',}}>
          <TextField
            type="text"
            placeholder="Search Colleges and Courses"
            variant="outlined"
            fullWidth
            InputProps={{
              style: { borderRadius: '40px',backgroundColor:'white'},
              endAdornment: (
                <InputAdornment position="end">
                  <IconButton type="submit" >
                    <SearchIcon style={{ color: 'black' }} />
                  </IconButton>
                </InputAdornment>
              ),
            }}
          />
        </form>
      </Grid>
    </Grid>
  );
};

export default Searchbar;
