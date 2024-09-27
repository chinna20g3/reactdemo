import React, { useState } from 'react';
import Slider from 'react-slick';
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import BengaluruImage from '../../src/assets/Bengaluru.png'; // Ensure correct paths to images
import MumbaiImage from '../../src/assets/Mumbai.png';
import HyderabadImage from '../../src/assets/Hyderabad.png';
import KolkataImage from '../../src/assets/Kolkata.png';
import ChennaiImage from '../../src/assets/Chennai.png';
import { Grid, Tooltip, Modal, Box } from '@mui/material';

const cities = [
  { name: 'Bengaluru', image: BengaluruImage, description: 'The Silicon Valley of India.' },
  { name: 'Mumbai', image: MumbaiImage, description: 'The financial capital of India.' },
  { name: 'Hyderabad', image: HyderabadImage, description: 'Known for its IT industry and biryani.' },
  { name: 'Kolkata', image: KolkataImage, description: 'The cultural capital of India.' },
  { name: 'Chennai', image: ChennaiImage, description: 'Known for its temples and beaches.' },
];

const TopCities = () => {
  const [open, setOpen] = useState(false);
  const [selectedCity, setSelectedCity] = useState(null);

  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 5, // Adjusted to show 5 slides at a time
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 3000,
    nextArrow: <SampleNextArrow />,
    prevArrow: <SamplePrevArrow />,
    responsive: [
      {
        breakpoint: 1024,
        settings: {
          slidesToShow: 3,
          slidesToScroll: 1,
          infinite: true,
          dots: true
        }
      },
      {
        breakpoint: 600,
        settings: {
          slidesToShow: 2,
          slidesToScroll: 1,
          initialSlide: 2
        }
      },
      {
        breakpoint: 480,
        settings: {
          slidesToShow: 1,
          slidesToScroll: 1
        }
      }
    ]
  };

  const handleCityClick = (city) => {
    setSelectedCity(city);
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  return (
    <Grid style={{ width: '70%', margin: '0 auto', padding: '10px 0', height: 'auto', gap: '10px' }}>
      <h3 style={{ marginBottom: '5px', textAlign: 'center' }}>Top Cities</h3>
      <h5 style={{ marginTop: '0', textAlign: 'center' }}>Explore Top College Opportunities With Our Admission Portal</h5>
      <Slider {...settings}>
        {cities.map((city, index) => (
          <Grid key={index} style={{ padding: '0 10px' }}>
            <Tooltip title={city.name} arrow>
              <Grid
                className="city-card"
                style={{ textAlign: 'center', padding: '10px', border: '1px solid #ddd', borderRadius: '5px', cursor: 'pointer' }}
                onClick={() => handleCityClick(city)}
              >
                <img src={city.image} alt={city.name} style={{ width: '100%', height: 'auto', maxHeight: '60px' }} />
                <h3 style={{ margin: '5px 0' }}>{city.name}</h3>
              </Grid>
            </Tooltip>
          </Grid>
        ))}
      </Slider>

      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={{ position: 'absolute', top: '50%', left: '50%', transform: 'translate(-50%, -50%)', width: 200, bgcolor: 'background.paper', border: '2px solid #000', borderRadius: '5px', boxShadow: 10, p: 2 }}>
          {selectedCity && (
            <>
              <h2 id="modal-modal-title">{selectedCity.name}</h2>
              <p id="modal-modal-description">{selectedCity.description}</p>
              <img src={selectedCity.image} alt={selectedCity.name} style={{ width: '100%', borderRadius: '5px', maxHeight: '200px' }} />
            </>
          )}
        </Box>
      </Modal>
    </Grid>
  );
};

const SampleNextArrow = (props) => {
  const { className, style, onClick } = props;
  return (
    <div
      className={className}
      style={{ ...style, display: 'block', background: 'gray', borderRadius: '50%', right: '-10px' }}
      onClick={onClick}
    />
  );
}

const SamplePrevArrow = (props) => {
  const { className, style, onClick } = props;
  return (
    <div
      className={className}
      style={{ ...style, display: 'block', background: 'gray', borderRadius: '50%', left: '-10px' }}
      onClick={onClick}
    />
  );
}

export default TopCities;
