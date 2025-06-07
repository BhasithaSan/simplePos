import SearchProduct from "./SearchProduct";
import ProductList from "../Product/ProductList";
import { useSelector } from "react-redux";
import type { RootState } from "../../app/store";
import type { ProductWithQuantityProp } from "../../Props/productProp";
import CurrentProduct from "../Product/CurrentProduct";
import { Dashboard } from "./DashBoardCard/Dashboard";
import PopupProduct from "../Product/PopupProduct";

const ProcessOrder = () => {

  const products = useSelector((state: RootState) => state.products);
  const lastItem: ProductWithQuantityProp=products[products.length-1];

  
  const clickedProduct = useSelector((state: RootState) => state.editProduct);


  return (
    <div className="container mt-5 position-relative">
      <div className="row">
        <div className="col-md-6 mb-3 border">
          <SearchProduct />
        </div>
        <div className="border col-md-5 mx-md-5">
          <Dashboard />
          {lastItem && products.length > 0 ? (
            <CurrentProduct {...lastItem} />
          ) : (
            <h4>No products available</h4>
          )}
        </div>
      </div>

      <div className="row">
        {lastItem && products.length > 0 ? (
          <h1>checked</h1>
        ) : (
          <h2>no checked products</h2>
        )}
        <ProductList />
      </div>

      
      {clickedProduct.id !== "" && (
        <>
         
          <div
            className="position-fixed top-0 start-0 w-100 h-100 bg-dark bg-opacity-50"
            style={{ zIndex: 1040 }}
          ></div>

         
          <div
            className="position-fixed top-50 start-50 translate-middle"
            style={{ zIndex: 1050 }}
          >
            <PopupProduct />
          </div>
        </>
      )}
    </div>

  );
};

export default ProcessOrder;
