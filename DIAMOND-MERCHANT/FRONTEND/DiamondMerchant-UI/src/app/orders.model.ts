export class Orders{
    constructor(
        public  oid?: number,
        public  pname?: string,
        public  oqty?: number,
        public  oprice?: number,
        public odate?: Date,
        public ostatus?: string

    ) {}
}