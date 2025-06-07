import  { useState } from 'react'
import axiosInstance from '../../../Api/axiosConfig';
import { useSelector } from 'react-redux';
import type { RootState } from '../../../app/store';
import type { ProductWithQuantityProp } from '../../../Props/productProp';

export const Dashboard = () => {
  const products = useSelector((state: RootState) => state.products);

    const getTally = ()=> {
    const total=products.reduce((total:number,currentProduct:ProductWithQuantityProp)=>{
      return total+currentProduct.unitPrice *currentProduct.quantity;
    },0);
    return total;
    
  }
   
  return (
    <>
    <div className='container'>
        <h3>Customer name</h3>
        <span></span>
        <h2>Total</h2>
        <span>{getTally()}</span>
        <h3>Number of items checked</h3>
        <span>{products.length}</span>

    </div>

    </>
  )
}
