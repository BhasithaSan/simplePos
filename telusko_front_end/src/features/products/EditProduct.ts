
import { createSlice } from "@reduxjs/toolkit";
import type {PayloadAction}  from "@reduxjs/toolkit"
import type { ProductWithQuantityProp } from "../../Props/productProp";


const initialState:ProductWithQuantityProp={
    id: "",
    name: "", 
    unitPrice: 0,
    category:"",
    brand:"",
    quantity:0

}

const editProductSlice = createSlice({
  name: 'editProduct', 
  initialState,
  reducers: {
    
    setEditProduct: (state, action: PayloadAction<ProductWithQuantityProp>) => {
    
        return action.payload

    }


  }
});

export const { setEditProduct } = editProductSlice.actions;
export default editProductSlice.reducer;