export class Orders{
    constructor(
        public  oid?: number,
        public  cid?: number,
        public  rid?: number,
        public  pid?: number,
        public  pname?: string,
        public  oqty?: number,
        public  oprice?: number,
        public odate?: Date,
        public ostatus?: string

    ) {}
}