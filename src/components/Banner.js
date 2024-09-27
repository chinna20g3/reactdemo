import React from 'react';
import SearchBar from './Searchbar';
import { Grid } from '@mui/material';
import image from '../../src/assets/1.jpg';

export const Banner = () => {
  return (
    <Grid
      container
      style={{
        backgroundImage: `url(${image})`,
        backgroundSize: 'cover',
        padding: '50px 20px',
        color: 'white',
        textAlign: 'center',
      }}
    >
      <Grid item xs={12} style={{ maxWidth: '450px', height: '300px', margin: '0 auto' }}>
        <SearchBar />
        <h1 style={{ marginTop: '-80px' }}>Top Colleges In Bangalore</h1>
      </Grid>
    </Grid>
  );
};
export default Banner;


