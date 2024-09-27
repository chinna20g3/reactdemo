import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './components/HomePage';
import Details from './components/Details';
import Rack from './components/Rack';

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/colleges/:collegeId" element={<Details />} />
        <Route path="/information/:collegeId" element={<Rack />} />
      </Routes>
    </Router>
  );
};

export default App;
