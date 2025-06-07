export default interface ProductProp {
    id: string;
    name: string;  
    unitPrice: number;
    category:String;
    brand:String;
}

export interface ProductWithQuantityProp extends ProductProp{
  quantity:number
}
