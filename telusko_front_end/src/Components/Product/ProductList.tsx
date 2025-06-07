import type { RootState } from "../../app/store";
import { useSelector } from "react-redux";
import CurrentProduct from "./CurrentProduct";


const  ProductList=()=>{

     const products = useSelector((state: RootState) => state.products);

     return<>
     <div className=" mt-5">



         <div className="row"> 
            {products.map((productWithQuantity, index) => (
            


          <div className="col-md-6 col-lg-4 mb-3 ">
            <CurrentProduct
              key={`${index}`}
              id={productWithQuantity.id}
              name={productWithQuantity.name}
              unitPrice={productWithQuantity.unitPrice}
              brand={productWithQuantity.brand}
              category={productWithQuantity.category}
              quantity={productWithQuantity.quantity}
            />
            </div>
         
          ))}
           </div>
     </div>
    
     
    

    </>
}

export default   ProductList;