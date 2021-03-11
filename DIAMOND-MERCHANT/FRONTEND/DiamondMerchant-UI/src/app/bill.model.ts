export class Bill{
    constructor(
        public  bid?: number,
        public  ename?: string,
        public  cname?: string,
        public  pname?: string,
        public  qty?: number,
        public  price?: number,
        public  dop?: Date,
    ) {}
}