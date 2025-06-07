import { configureStore } from '@reduxjs/toolkit';
import productReducer from '../features/products/Products';
import editProductReducer from '../features/products/EditProduct'

const store = configureStore({
  reducer: {
    products: productReducer,
    editProduct:editProductReducer
  }
});

export default store;

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;

