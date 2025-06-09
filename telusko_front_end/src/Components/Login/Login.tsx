import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const   Login= () => {

    const [user,setUser] = useState("")
    const [password,setPassword] = useState("")

    const navigate = useNavigate();
    const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
            e.preventDefault();
  
            try {
            const response = await axios.post('http://localhost:8081/login', {
            username: user,
            password: password
            });

         
            const token = response.data; 
            localStorage.setItem("token", token);

            // Redirect
            navigate("/processOrder");

        } catch (error) {
            console.error("Login failed:", error);
            alert("Invalid credentials");
        }
};
  return (
    <div className='Container'>
        <form onSubmit={handleSubmit}>
            <div className="form-group">
                <label htmlFor="exampleUser">username</label>
                <input type="text" className="form-control" id="exampleUser" placeholder="Enter user name" value={user} onChange={(e)=>setUser(e.target.value)}/>
            </div>
            <div className="form-group">
                <label htmlFor="exampleInputPassword1">Password</label>
                <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Password" value={password} onChange={(e)=>setPassword(e.target.value)} />
            </div>
            {/* <div className="form-check">
                <input type="checkbox" className="form-check-input" id="exampleCheck1"/>
                <label className="form-check-label" htmlFor="exampleCheck1">Check me out</label>
            </div> */}
            <button type="submit" className="btn btn-primary" onClick={()=>handleSubmit}  >Submit</button>
        </form>
    </div>
  )
}

export default Login;