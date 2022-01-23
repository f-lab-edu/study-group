import React from 'react';
import './App.css';

import { Route, Routes, BrowserRouter } from 'react-router-dom';
import Main from './pages/Main';

function App() {
  return (
    <div className="App">
      <header>
      </header>
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={ <Main /> }/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
