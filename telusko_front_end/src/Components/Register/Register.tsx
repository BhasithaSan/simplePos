import axios from 'axios';
import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const Register = () => {
  const [user, setUser] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    try {
      const response = await axios.post('http://localhost:8081/register', {
        username: user,
        password: password,
        role: "USER" // ✅ assuming backend expects this
      });

      console.log("Registration successful");

      const token = response.data;
      localStorage.setItem("token", token);

      navigate("/processOrder");
    } catch (error) {
      console.error("Registration failed:", error);
      alert("Something went wrong");
    }
  };

  return (
    <div className='Container'>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="exampleUser">Username</label>
          <input
            type="text"
            className="form-control"
            id="exampleUser"
            placeholder="Enter user name"
            value={user}
            onChange={(e) => setUser(e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="exampleInputPassword1">Password</label>
          <input
            type="password"
            className="form-control"
            id="exampleInputPassword1"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
};

export default Register;
