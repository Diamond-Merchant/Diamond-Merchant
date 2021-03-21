export class Product{
    constructor(
        public  pid?: number,
        public  sid?: number,
        public  pname?: string,
        public  category?: string,
        public  shelflocation?: string,
        public  costprice?: number,
        public  mrp?: number,
        public  manufacturer?: string

    ) {}
}