import React from 'react';
import { Grid} from '@mui/material';
import Header from "./Header"
import Footer from './Footer';
import Banner from "./Banner";
import { Navbar } from './Navbar';
import TopColleges from './TopColleges';
import BlogSection from './blog';
import FeaturedColleges from './FeaturedColleges';
import TopCities from './TopCities'

const HomePage = () => {

  return (
    <Grid>
       <Header/>
      <Navbar/>
      <Banner/>
      <TopCities/>
      <TopColleges/>
      <BlogSection/>
      <FeaturedColleges/>
      <Footer/>
      
    
    </Grid>
  );
};

export default HomePage;
