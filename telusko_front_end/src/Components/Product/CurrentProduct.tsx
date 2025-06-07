import { useDispatch } from "react-redux";
import type { ProductWithQuantityProp } from "../../Props/productProp";
import { setEditProduct } from "../../features/products/EditProduct";




const CurrentProduct=({id,name,unitPrice,brand,category,quantity}:ProductWithQuantityProp)=>{

    console.log(name)

     const dispatch=useDispatch()

     const handleEdit=()=>{
          dispatch(setEditProduct({id:id,name:name,unitPrice:unitPrice,brand:brand,category:category,quantity:quantity}))
     }
    

    return<>
    <div className="border border-gray-200 rounded-lg p-4 shadow-sm ">
      <ul className="list-unstyled p-2">
        <li>
          <span className="font-medium text-gray-500">ID:</span>
          <span className="text-gray-800">{id}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Name:</span>
          <span className="text-gray-800">{name}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Unit Price:</span>
          <span className="text-gray-800">${unitPrice.toFixed(2)}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Brand:</span>
          <span className="text-gray-800">{brand}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Category:</span>
          <span className="text-gray-800">{category}</span>
        </li>
        <li>
          <span className="font-medium text-gray-500">Quantity:</span>
          <span className="text-gray-800">{quantity}</span>
        </li>
      </ul>
      <div className="d-flex flex-row justify-content-between">
        <button className="btn btn-success" onClick={handleEdit}>Edit</button>
        <button className="btn btn-danger"> Delete</button>
      </div>
      
    </div>
    
    
    </>


}

export default  CurrentProduct;

