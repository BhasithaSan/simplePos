import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import './App.css'
import ProcessOrder from './Components/Order/ProcessOrder'
import Login from './Components/Login/Login';
import { Routes } from 'react-router-dom';
import { Route } from 'react-router-dom'; 
import Register from './Components/Register/Register';
function App() {

  return (
    <>
   
      
      <Routes>
        <Route path="/login" element={ <Login/>} />
        <Route path="/processOrder" element={<ProcessOrder/>} /> 
        <Route path="/" element={<Register/>} />
      

      </Routes>
       
    </> 
  )
}

export default App
