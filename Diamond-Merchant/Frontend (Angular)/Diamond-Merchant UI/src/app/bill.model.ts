export class Bill{
    constructor(
        public  bid?: number,
        public  eid?: number,
        public  cid?: number,
        public  rid?: number,
        public  pid?: number,
        public  sid?: number,
        public  oid?: number,
        public  ename?: string,
        public  cname?: string,
        public  pname?: string,
        public  qty?: number,
        public  price?: number,
        public  dop?: Date,
    ) {}
}