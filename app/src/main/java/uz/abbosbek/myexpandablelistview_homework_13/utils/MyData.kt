package uz.abbosbek.myexpandablelistview_homework_13.utils

import uz.abbosbek.myexpandablelistview_homework_13.models.User

object MyData {

    val map = HashMap<String, ArrayList<User>>()
    val titleList_Parent = ArrayList<String>()

    fun addElement() {
        titleList_Parent.add("Mobiles")
        titleList_Parent.add("Laptops")
        titleList_Parent.add("Computer Accessories")
        titleList_Parent.add("Home Entertainment")
        titleList_Parent.add("TVs by brand")
        titleList_Parent.add("Kitchen Appliances")


        val listMobiles = ArrayList<User>()
        listMobiles.add(
            User(
                "Mi",
                "Xiaomi is a global brand making quality technology accessible to everyone"
            )
        )
        listMobiles.add(
            User(
                "Not",
                "A mobile phone is a portable telephone that can make and receive calls over a radio frequency link while the user is moving within a telephone service area"
            )
        )
        listMobiles.add(
            User(
                "Samsung",
                "Samsung Galaxy is a series of computing and mobile computing devices that are designed, manufactured and marketed by Samsung Electronics"
            )
        )
        listMobiles.add(
            User(
                "Oppo",
                "The brand name Oppo was registered in China in 2001 and launched in 2004"
            )
        )
        listMobiles.add(
            User(
                "Apple",
                "The iPhone is a line of smartphones produced by Apple Inc. which uses Apple's own iOS mobile operating system"
            )
        )
        listMobiles.add(
            User(
                "Honor",
                "Honor is a smartphone brand majority owned by a state-owned enterprise controlled by the municipal government of Shenzhen"
            )
        )


        val listLaotops = ArrayList<User>()
        listLaotops.add(
            User(
                "Aser",
                "Acer Nitro 5 Gaming Laptop, 9th Gen Intel Core i5-9300H, NVIDIA GeForce GTX 1650"
            )
        )
        listLaotops.add(
            User(
                "Victus",
                "VICTUS 16.1 GAMING LAPTOP · Up to Intel® Core™ i7-12700H (up to 4.7 GHz with Intel® Turbo Boost Technology(2g)"
            )
        )
        listLaotops.add(
            User(
                "Dell",
                "Shop & Compare Laptop Computers & 2-in-1 PCs. Shop high-performing Latitude, Vostro, Precision, Inspiron & XPS laptops today"
            )
        )
        listLaotops.add(
            User(
                "Mac",
                "Our most popular laptop, MacBook Air is supercharged by M1 and M2 chips. Featuring FaceTime HD camera, Touch ID"
            )
        )
        listLaotops.add(
            User(
                "Lenovo",
                "Smooth transformation. Yoga transforms from laptop to tent mode, to stand mode, to tablet mode and back again"
            )
        )

        val listAccessories = ArrayList<User>()
        listAccessories.add(
            User(
                "Naushnic",
                "Аксессуары: Power Bank, Charging devices, Headphones, Other accessories ; Gadgets: Smart watch, Other gadgets, TV set-top boxes"
            )
        )
        listAccessories.add(
            User(
                "Mouse",
                "A computer mouse (plural mice, sometimes mouses) is a hand-held pointing device that detects two-dimensional motion relative to a surface"
            )
        )
        listAccessories.add(
            User(
                "Klaviatura",
                "Klaviatura, Fujitsu Sichqonchasi. Keyboard - a peripheral device for entering data into a PC and control commands using keys located in a specific order"
            )
        )

        val listHomeEntertainment = ArrayList<User>()
        listHomeEntertainment.add(
            User(
                "Gta ",
                "Grand Theft Auto (GTA) is a series of action-adventure games created by David Jones and Mike Dailly."
            )
        )
        listHomeEntertainment.add(
            User(
                "PUBG",
                "PUBG: Battlegrounds (previously known as PlayerUnknown's Battlegrounds) is a battle royale game developed by PUBG"
            )
        )
        listHomeEntertainment.add(
            User(
                "Control",
                "The game revolves around the Federal Bureau of Control (FBC), a secret U.S. government agency tasked with containing and studying"
            )
        )
        listHomeEntertainment.add(
            User(
                "Playstation",
                "PlayStation is a video gaming brand that consists of five home video game consoles, two handhelds, a media center, and a smartphone"
            )
        )

        val listTVBrand = ArrayList<User>()
        listTVBrand.add(
            User(
                "Samsung",
                "Samsung Electronics Co., Ltd is a South Korean multinational electronics corporation headquartered in Yeongtong-gu"
            )
        )
        listTVBrand.add(
            User(
                "Artel",
                "Artel household appliances are manufactured using advanced technologies on modern"
            )
        )
        listTVBrand.add(
            User(
                "LG",
                "LG Electronics Inc is a South Korean multinational electronics company headquartered in Yeouido-dong, Seoul, South Korea"
            )
        )

        val listKitchen = ArrayList<User>()
        listKitchen.add(
            User(
                "Oven",
                "An oven is a tool which is used to expose materials to a hot environment"
            )
        )
        listKitchen.add(
            User(
                "Plate",
                "Plate (metal), a rectangular flat metal stock that is more than 6 mm or 0.25 in thick, not as thin as sheet metal"
            )
        )
        listKitchen.add(
            User(
                "Kettle",
                "A kettle, sometimes called a tea kettle or teakettle, is a type of pot specialized for boiling water"
            )
        )
        listKitchen.add(
            User(
                "Cupboards",
                "A cupboard is a piece of furniture for enclosing dishware or grocery items that are stored in a home"
            )
        )
        listKitchen.add(
            User(
                "Cooker",
                "Cooker may refer to several types of cooking appliances and devices used for cooking foods"
            )
        )
        listKitchen.add(
            User(
                "Freezer",
                "A freezer is a device similar to a refrigerator that maintains a temperature below the freezing point of water"
            )
        )



        map[titleList_Parent[0]] = listMobiles
        map[titleList_Parent[1]] = listLaotops
        map[titleList_Parent[2]] = listAccessories
        map[titleList_Parent[3]] = listHomeEntertainment
        map[titleList_Parent[4]] = listTVBrand
        map[titleList_Parent[5]] = listKitchen
    }
}