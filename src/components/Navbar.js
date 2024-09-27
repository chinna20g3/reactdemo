import React from 'react';
import image from "../../src/assets/2.jpg";
import { AppBar, Toolbar, IconButton, Menu, MenuItem, Button, Box } from '@mui/material';
import MenuIcon from '@mui/icons-material/Menu';
import { useNavigate } from 'react-router-dom';

export const Navbar = () => {
  const [anchorEl, setAnchorEl] = React.useState(null);
  const navigate = useNavigate();

  const handleMenu = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleClose = () => {
    setAnchorEl(null);
  };

  const handleNavigate = (path) => {
    navigate(path);
  };

  return (
    <AppBar position="static" style={{ backgroundColor: '#fff', color: '#000', boxShadow: '0 2px 4px rgba(0, 0, 0, 0.1)' }}>
      <Toolbar style={{ display: 'flex', justifyContent: 'space-between' }}>
        <IconButton edge="start" color="inherit" aria-label="menu" sx={{ mr: 2 }} onClick={() => handleNavigate("/")}>
          <img src={image} alt="Logo" style={{ width: '55px', height: '50px' }} />
        </IconButton>
        <Box sx={{ display: { xs: 'none', md: 'flex' }, alignItems: 'center' }}>
          {['Medical', 'Paramedical', 'Engineering', 'Pharmacy', 'Nursing', 'Management', 'Diploma', 'Science', 'Law'].map((item) => (
            <Button key={item} color="inherit" style={{ color: 'blue' }} onClick={() => handleNavigate(`/${item.toLowerCase()}`)}>
              {item}
            </Button>
          ))}
        </Box>
        <Box sx={{ display: { xs: 'flex', md: 'none' } }}>
          <IconButton
            size="large"
            aria-label="menu"
            aria-controls="menu-appbar"
            aria-haspopup="true"
            onClick={handleMenu}
            color="inherit"
          >
            <MenuIcon />
          </IconButton>
          <Menu
            id="menu-appbar"
            anchorEl={anchorEl}
            anchorOrigin={{
              vertical: 'top',
              horizontal: 'right',
            }}
            keepMounted
            transformOrigin={{
              vertical: 'top',
              horizontal: 'right',
            }}
            open={Boolean(anchorEl)}
            onClose={handleClose}
          >
            {['Medical', 'Paramedical', 'Engineering', 'Pharmacy', 'Nursing', 'Management', 'Diploma', 'Science', 'Law'].map((item) => (
              <MenuItem key={item} onClick={() => { handleClose(); handleNavigate(`/${item.toLowerCase()}`); }}>{item}</MenuItem>
            ))}
          </Menu>
        </Box>
      </Toolbar>
    </AppBar>
  );
};

export default Navbar;
