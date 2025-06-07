import { createSlice } from "@reduxjs/toolkit";
import type {PayloadAction}  from "@reduxjs/toolkit"
import type  ProductProp  from "../../Props/productProp";
import type { ProductWithQuantityProp } from "../../Props/productProp";

const initialState: ProductWithQuantityProp[] = []; 
const productSlice = createSlice({
  name: 'products', 
  initialState,
  reducers: {
    
    addProduct: (state, action: PayloadAction<ProductWithQuantityProp>) => {
      const existingIndex = state.findIndex(
        item => item.id === action.payload.id
      );
      if (existingIndex !== -1 && action.payload.quantity !==0) {
    
    state[existingIndex].quantity = action.payload.quantity;
  } else if(action.payload.quantity !==0) {
    
    state.push(action.payload);
  }
    }
  ,

    // clickProduct:(state, action: PayloadAction<ProductWithQuantityProp>){

    // }

    removeProduct:(state, action: PayloadAction<ProductProp>)=>{
        state.filter((product)=>{
            product.id != action.payload.id
        }   
        )

    },
    // lastEntered:(state){

    // }





  }
});

export const { addProduct } = productSlice.actions;
export default productSlice.reducer;