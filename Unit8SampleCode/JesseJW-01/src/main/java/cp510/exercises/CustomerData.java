package cp510.exercises;
import java.util.List;
import java.util.ArrayList;
public class CustomerData
{
    private static List<Customer> customerList = new ArrayList<>();
    public static List<Customer> getCustomerData()
    {
        Customer cust;
        Address addr;
        addr = new Address("1818 State Route 3","Fulton","NY","13069");
        cust = new Customer("Jordyn","Tapia",addr);
        customerList.add(cust);
        addr = new Address("170 Fort Morgan Road","Gulf Shores","AL","36542");
        cust = new Customer("Melody","Hobbs",addr);
        customerList.add(cust);
        addr = new Address("42417 Hwy 195","Haleyville","AL","35565");
        cust = new Customer("Evelyn","Salas",addr);
        customerList.add(cust);
        addr = new Address("2200 Sparkman Drive","Huntsville","AL","35810");
        cust = new Customer("Bryson","Ramirez",addr);
        customerList.add(cust);
        addr = new Address("4538 Us Hwy 231","Wetumpka","AL","36092");
        cust = new Customer("Daniela","Nava",addr);
        customerList.add(cust);
        addr = new Address("13675 Hwy 43","Russellville","AL","35653");
        cust = new Customer("Piper","Andrade",addr);
        customerList.add(cust);
        addr = new Address("6265 Brockport Spencerport Rd","Brockport","NY","14420");
        cust = new Customer("Trinity","Newton",addr);
        customerList.add(cust);
        addr = new Address("36 Paramount Drive","Raynham","MA","2767");
        cust = new Customer("Axel","Day",addr);
        customerList.add(cust);
        addr = new Address("3100 Hough Rd","Florence","AL","35630");
        cust = new Customer("Justin","Dorsey",addr);
        customerList.add(cust);
        addr = new Address("1201 Rt 300","Newburgh","NY","12550");
        cust = new Customer("Vivian","Wagner",addr);
        customerList.add(cust);
        addr = new Address("515 Sawmill Road","West Haven","CT","6516");
        cust = new Customer("Grace","Mueller",addr);
        customerList.add(cust);
        addr = new Address("6350 Cottage Hill Road","Mobile","AL","36609");
        cust = new Customer("Braxton","Booth",addr);
        customerList.add(cust);
        addr = new Address("235 Queen St","Southington","CT","6489");
        cust = new Customer("Damian","Solomon",addr);
        customerList.add(cust);
        addr = new Address("255 W Main St","Avon","CT","6001");
        cust = new Customer("Jeremiah","Mccormick",addr);
        customerList.add(cust);
        addr = new Address("135 Fairgrounds Memorial Pkwy","Ithaca","NY","14850");
        cust = new Customer("Emmett","Atkins",addr);
        customerList.add(cust);
        addr = new Address("295 Plymouth Street","Halifax","MA","2338");
        cust = new Customer("Aiden","Hamilton",addr);
        customerList.add(cust);
        addr = new Address("780 Lynnway","Lynn","MA","1905");
        cust = new Customer("Madelyn","Lawson",addr);
        customerList.add(cust);
        addr = new Address("161 Berlin Road","Cromwell","CT","6416");
        cust = new Customer("Tyler","Fletcher",addr);
        customerList.add(cust);
        addr = new Address("374 William S Canning Blvd","Fall River","MA","2721");
        cust = new Customer("Carter","Morales",addr);
        customerList.add(cust);
        addr = new Address("677 Timpany Blvd","Gardner","MA","1440");
        cust = new Customer("Alice","Cunningham",addr);
        customerList.add(cust);
        addr = new Address("100 Elm Ridge Center Dr","Greece","NY","14626");
        cust = new Customer("Henry","Garza",addr);
        customerList.add(cust);
        addr = new Address("450 Highland Ave","Salem","MA","1970");
        cust = new Customer("Kayden","Erickson",addr);
        customerList.add(cust);
        addr = new Address("297 Grant Avenue","Auburn","NY","13021");
        cust = new Customer("Avery","Ayala",addr);
        customerList.add(cust);
        addr = new Address("288 Larkin","Monroe","NY","10950");
        cust = new Customer("Clara","Velazquez",addr);
        customerList.add(cust);
        addr = new Address("337 Russell St","Hadley","MA","1035");
        cust = new Customer("Landon","Lambert",addr);
        customerList.add(cust);
        addr = new Address("85 Crooked Hill Road","Commack","NY","11725");
        cust = new Customer("Andrea","Sellers",addr);
        customerList.add(cust);
        addr = new Address("425 Route 31","Macedon","NY","14502");
        cust = new Customer("Chloe","Douglas",addr);
        customerList.add(cust);
        addr = new Address("5033 Transit Road","Clarence","NY","14031");
        cust = new Customer("Chloe","Nash",addr);
        customerList.add(cust);
        addr = new Address("25737 US Rt 11","Evans Mills","NY","13637");
        cust = new Customer("London","Orozco",addr);
        customerList.add(cust);
        addr = new Address("301 Massachusetts Ave","Lunenburg","MA","1462");
        cust = new Customer("Lydia","Brady",addr);
        customerList.add(cust);
        addr = new Address("3164 Berlin Turnpike","Newington","CT","6111");
        cust = new Customer("Tyler","Bullock",addr);
        customerList.add(cust);
        addr = new Address("3700 Hwy 280-431 N","Phenix City","AL","36867");
        cust = new Customer("Amir","Portillo",addr);
        customerList.add(cust);
        addr = new Address("300 Colony Place","Plymouth","MA","2360");
        cust = new Customer("Amara","Richards",addr);
        customerList.add(cust);
        addr = new Address("9248 Parkway East","Birmingham","AL","35206");
        cust = new Customer("Ruby","Juarez",addr);
        customerList.add(cust);
        addr = new Address("233 5th Ave Ext","Johnstown","NY","12095");
        cust = new Customer("Bryce","Hanna",addr);
        customerList.add(cust);
        addr = new Address("2300 Dixwell Ave","Hamden","CT","6514");
        cust = new Customer("Nathan","Wong",addr);
        customerList.add(cust);
        addr = new Address("1903 Cobbs Ford Rd","Prattville","AL","36066");
        cust = new Customer("Gabriella","Boyer",addr);
        customerList.add(cust);
        addr = new Address("990 Route 5 20","Geneva","NY","14456");
        cust = new Customer("Joseph","Nicholson",addr);
        customerList.add(cust);
        addr = new Address("340 East Meighan Blvd","Gadsden","AL","35903");
        cust = new Customer("Scarlett","Johns",addr);
        customerList.add(cust);
        addr = new Address("517 West Avalon Ave","Muscle Shoals","AL","35661");
        cust = new Customer("Madeline","Lamb",addr);
        customerList.add(cust);
        addr = new Address("680 Connecticut Avenue","Norwalk","CT","6854");
        cust = new Customer("Miles","Leonard",addr);
        customerList.add(cust);
        addr = new Address("120 Commercial Parkway","Branford","CT","6405");
        cust = new Customer("Cooper","Romero",addr);
        customerList.add(cust);
        addr = new Address("3801 Eastern Blvd","Montgomery","AL","36116");
        cust = new Customer("Addison","Cantrell",addr);
        customerList.add(cust);
        addr = new Address("420 Buckland Hills Dr","Manchester","CT","6040");
        cust = new Customer("Jason","Wade",addr);
        customerList.add(cust);
        addr = new Address("164 Danbury Rd","New Milford","CT","6776");
        cust = new Customer("Brody","Ingram",addr);
        customerList.add(cust);
        addr = new Address("100 Charlton Road","Sturbridge","MA","1566");
        cust = new Customer("Tucker","Weber",addr);
        customerList.add(cust);
        addr = new Address("1972 Hwy 431","Boaz","AL","35957");
        cust = new Customer("Sadie","Cain",addr);
        customerList.add(cust);
        addr = new Address("465 Bridgeport Avenue","Shelton","CT","6484");
        cust = new Customer("Valerie","Hale",addr);
        customerList.add(cust);
        addr = new Address("11 Jungle Road","Leominster","MA","1453");
        cust = new Customer("Nicholas","Durham",addr);
        customerList.add(cust);
        addr = new Address("250 Rt 59","Airmont","NY","10901");
        cust = new Customer("Tristan","Ellis",addr);
        customerList.add(cust);
        addr = new Address("1000 State Route 36","Hornell","NY","14843");
        cust = new Customer("Wyatt","Friedman",addr);
        customerList.add(cust);
        addr = new Address("2001 Glenn Bldv Sw","Fort Payne","AL","35968");
        cust = new Customer("Vincent","Calderon",addr);
        customerList.add(cust);
        addr = new Address("601 Frank Stottile Blvd","Kingston","NY","12401");
        cust = new Customer("Everett","Knox",addr);
        customerList.add(cust);
        addr = new Address("1916 Center Point Rd","Center Point","AL","35215");
        cust = new Customer("Isabelle","Gonzalez",addr);
        customerList.add(cust);
        addr = new Address("7100 Aaron Aronov Drive","Fairfield","AL","35064");
        cust = new Customer("Iris","Lynn",addr);
        customerList.add(cust);
        addr = new Address("1470 S Washington St","North Attleboro","MA","2760");
        cust = new Customer("Leilani","Monroe",addr);
        customerList.add(cust);
        addr = new Address("150 Springville Station Blvd","Springville","AL","35146");
        cust = new Customer("Lydia","Ayers",addr);
        customerList.add(cust);
        addr = new Address("1100 New Haven Road","Naugatuck","CT","6770");
        cust = new Customer("Dean","Dean",addr);
        customerList.add(cust);
        addr = new Address("101 Sanford Farm Shpg Center","Amsterdam","NY","12010");
        cust = new Customer("Riley","Mercado",addr);
        customerList.add(cust);
        addr = new Address("1717 South College Street","Auburn","AL","36830");
        cust = new Customer("Zion","Savage",addr);
        customerList.add(cust);
        addr = new Address("200 Dutch Meadows Ln","Glenville","NY","12302");
        cust = new Customer("Gavin","Rodgers",addr);
        customerList.add(cust);
        addr = new Address("700 Oak Street","Brockton","MA","2301");
        cust = new Customer("Brooks","Rosas",addr);
        customerList.add(cust);
        addr = new Address("1011 US Hwy 72 East","Athens","AL","35611");
        cust = new Customer("Tyler","Chavez",addr);
        customerList.add(cust);
        addr = new Address("1775 Washington St","Hanover","MA","2339");
        cust = new Customer("Xander","Kent",addr);
        customerList.add(cust);
        addr = new Address("742 Main Street","North Oxford","MA","1537");
        cust = new Customer("Luke","Mccarthy",addr);
        customerList.add(cust);
        addr = new Address("4300 Lakeville Road","Geneseo","NY","14454");
        cust = new Customer("Elizabeth","Shannon",addr);
        customerList.add(cust);
        addr = new Address("8650 Madison Blvd","Madison","AL","35758");
        cust = new Customer("King","Hicks",addr);
        customerList.add(cust);
        addr = new Address("55 Brooksby Village Way","Danvers","MA","1923");
        cust = new Customer("Brielle","Gill",addr);
        customerList.add(cust);
        addr = new Address("3300 South Oates Street","Dothan","AL","36301");
        cust = new Customer("Lily","Mendez",addr);
        customerList.add(cust);
        addr = new Address("10040 County Road 48","Fairhope","AL","36533");
        cust = new Customer("Ezekiel","Krueger",addr);
        customerList.add(cust);
        addr = new Address("591 Memorial Dr","Chicopee","MA","1020");
        cust = new Customer("Stella","Lin",addr);
        customerList.add(cust);
        addr = new Address("540 West Bypass","Andalusia","AL","36420");
        cust = new Customer("Richard","Davenport",addr);
        customerList.add(cust);
        addr = new Address("24833 Johnt Reidprkw","Scottsboro","AL","35768");
        cust = new Customer("Leah","Powers",addr);
        customerList.add(cust);
        addr = new Address("11697 US Hwy 431","Guntersville","AL","35976");
        cust = new Customer("Thomas","Grant",addr);
        customerList.add(cust);
        addr = new Address("4975 Transit Rd","Lancaster","NY","14086");
        cust = new Customer("Miguel","Huffman",addr);
        customerList.add(cust);
        addr = new Address("1970 S University Blvd","Mobile","AL","36609");
        cust = new Customer("Lucas","Delarosa",addr);
        customerList.add(cust);
        addr = new Address("5710 Mcfarland Blvd","Northport","AL","35476");
        cust = new Customer("Iris","Shelton",addr);
        customerList.add(cust);
        addr = new Address("973 Gilbert Ferry Road Se","Attalla","AL","35954");
        cust = new Customer("Edward","Moran",addr);
        customerList.add(cust);
        addr = new Address("139 Merchant Place","Cobleskill","NY","12043");
        cust = new Customer("Victor","Zuniga",addr);
        customerList.add(cust);
        addr = new Address("2500 Dawes Road","Mobile","AL","36695");
        cust = new Customer("George","Reilly",addr);
        customerList.add(cust);
        addr = new Address("200 Sunrise Mall","Massapequa","NY","11758");
        cust = new Customer("Finn","Clayton",addr);
        customerList.add(cust);
        addr = new Address("11610 Memorial Pkwy South","Huntsville","AL","35803");
        cust = new Customer("Patrick","Luna",addr);
        customerList.add(cust);
        addr = new Address("630 Coonial Promenade Pkwy","Alabaster","AL","35007");
        cust = new Customer("Kevin","Everett",addr);
        customerList.add(cust);
        addr = new Address("5245 Rangeline Service Rd","Mobile","AL","36619");
        cust = new Customer("David","Roy",addr);
        customerList.add(cust);
        addr = new Address("279 Troy Road","East Greenbush","NY","12061");
        cust = new Customer("Summer","Norman",addr);
        customerList.add(cust);
        addr = new Address("655 Boston Post Rd","Old Saybrook","CT","6475");
        cust = new Customer("Everett","Hunt",addr);
        customerList.add(cust);
        addr = new Address("250 Hartford Avenue","Bellingham","MA","2019");
        cust = new Customer("Valerie","Trujillo",addr);
        customerList.add(cust);
        addr = new Address("15445 Highway 24","Moulton","AL","35650");
        cust = new Customer("Hudson","Donaldson",addr);
        customerList.add(cust);
        addr = new Address("1501 Hwy 14 East","Selma","AL","36703");
        cust = new Customer("Hazel","Zimmerman",addr);
        customerList.add(cust);
        addr = new Address("30 Catskill","Catskill","NY","12414");
        cust = new Customer("Cecilia","Winters",addr);
        customerList.add(cust);
        addr = new Address("579 Troy-Schenectady Road","Latham","NY","12110");
        cust = new Customer("Colton","Skinner",addr);
        customerList.add(cust);
        addr = new Address("350 E Fairmount Ave","Lakewood","NY","14750");
        cust = new Customer("Teagan","Landry",addr);
        customerList.add(cust);
        addr = new Address("41 Anawana Lake Road","Monticello","NY","12701");
        cust = new Customer("Jayden","Clay",addr);
        customerList.add(cust);
        addr = new Address("30 Memorial Drive","Avon","MA","2322");
        cust = new Customer("Steven","Nielsen",addr);
        customerList.add(cust);
        addr = new Address("1365 Boston Post Road","Milford","CT","6460");
        cust = new Customer("Elise","Faulkner",addr);
        customerList.add(cust);
        addr = new Address("311 RT 9W","Glenmont","NY","12077");
        cust = new Customer("Sophia","Koch",addr);
        customerList.add(cust);
        addr = new Address("80 Town Line Rd","Rocky Hill","CT","6067");
        cust = new Customer("Margaret","Mathis",addr);
        customerList.add(cust);
        addr = new Address("1549 Rt 9","Halfmoon","NY","12065");
        cust = new Customer("Jose","Palmer",addr);
        customerList.add(cust);
        addr = new Address("901 Route 110","Farmingdale","NY","11735");
        cust = new Customer("Nicholas","Costa",addr);
        customerList.add(cust);
        addr = new Address("750 Academy Drive","Bessemer","AL","35022");
        cust = new Customer("Robert","Jefferson",addr);
        customerList.add(cust);
        addr = new Address("872 Route 13","Cortlandville","NY","13045");
        cust = new Customer("Naomi","Jenkins",addr);
        customerList.add(cust);
        addr = new Address("100 Thruway Plaza","Cheektowaga","NY","14225");
        cust = new Customer("Finley","Serrano",addr);
        customerList.add(cust);
        addr = new Address("6438 Basile Rowe","East Syracuse","NY","13057");
        cust = new Customer("Peyton","Giles",addr);
        customerList.add(cust);
        addr = new Address("165 Vaughan Ln","Pell City","AL","35125");
        cust = new Customer("Daniel","Vaughn",addr);
        customerList.add(cust);
        addr = new Address("1300 Montgomery Highway","Vestavia Hills","AL","35216");
        cust = new Customer("Evelyn","Martin",addr);
        customerList.add(cust);
        addr = new Address("34301 Hwy 43","Thomasville","AL","36784");
        cust = new Customer("Cora","Goodman",addr);
        customerList.add(cust);
        addr = new Address("103 North Caroline St","Herkimer","NY","13350");
        cust = new Customer("Alexandra","Morse",addr);
        customerList.add(cust);
        addr = new Address("3133 E Main St","Mohegan Lake","NY","10547");
        cust = new Customer("Ayla","Flowers",addr);
        customerList.add(cust);
        addr = new Address("2575 Us Hwy 43","Winfield","AL","35594");
        cust = new Customer("Emiliano","Singleton",addr);
        customerList.add(cust);
        addr = new Address("3501 20th Av","Valley","AL","36854");
        cust = new Customer("Chase","Choi",addr);
        customerList.add(cust);
        addr = new Address("3371 S Alabama Ave","Monroeville","AL","36460");
        cust = new Customer("Melanie","Payne",addr);
        customerList.add(cust);
        addr = new Address("685 Schillinger Rd","Mobile","AL","36695");
        cust = new Customer("Brandon","Wells",addr);
        customerList.add(cust);
        addr = new Address("6495 Atlanta Hwy","Montgomery","AL","36117");
        cust = new Customer("Easton","Rosario",addr);
        customerList.add(cust);
        addr = new Address("312 Palisades Blvd","Birmingham","AL","35209");
        cust = new Customer("Thiago","Lee",addr);
        customerList.add(cust);
        addr = new Address("8064 Brewerton Rd","Cicero","NY","13039");
        cust = new Customer("Scarlett","Charles",addr);
        customerList.add(cust);
        addr = new Address("4310 Montgomery Hwy","Dothan","AL","36303");
        cust = new Customer("Annabelle","Sanchez",addr);
        customerList.add(cust);
        addr = new Address("550 Providence Hwy","Walpole","MA","2081");
        cust = new Customer("Weston","Mcfarland",addr);
        customerList.add(cust);
        addr = new Address("43 Stephenville St","Massena","NY","13662");
        cust = new Customer("Charlotte","Robbins",addr);
        customerList.add(cust);
        addr = new Address("3176 South Eufaula Avenue","Eufaula","AL","36027");
        cust = new Customer("Finn","Berger",addr);
        customerList.add(cust);
        addr = new Address("1537 Hwy 231 South","Ozark","AL","36360");
        cust = new Customer("Margaret","Porter",addr);
        customerList.add(cust);
        addr = new Address("4206 N College Ave","Jackson","AL","36545");
        cust = new Customer("Evelyn","Adkins",addr);
        customerList.add(cust);
        addr = new Address("1201 Hwy 31 NW","Hartselle","AL","35640");
        cust = new Customer("Gabriel","Bowman",addr);
        customerList.add(cust);
        addr = new Address("1415 7Th Street South","Clanton","AL","35045");
        cust = new Customer("Aria","Huynh",addr);
        customerList.add(cust);
        addr = new Address("1501 Skyland Blvd E","Tuscaloosa","AL","35405");
        cust = new Customer("Carson","Simmons",addr);
        customerList.add(cust);
        addr = new Address("69 Prospect Hill Road","East Windsor","CT","6088");
        cust = new Customer("David","Lyons",addr);
        customerList.add(cust);
        addr = new Address("41301 US Hwy 280","Sylacauga","AL","35150");
        cust = new Customer("Zoey","Burns",addr);
        customerList.add(cust);
        addr = new Address("4180 Us Hwy 431","Roanoke","AL","36274");
        cust = new Customer("Joseph","Mcconnell",addr);
        customerList.add(cust);
        addr = new Address("1801 Hwy 78 East","Jasper","AL","35501");
        cust = new Customer("Edward","Montes",addr);
        customerList.add(cust);
        addr = new Address("1400 Farmington Ave","Bristol","CT","6010");
        cust = new Customer("Aaron","Bean",addr);
        customerList.add(cust);
        addr = new Address("969 Us Hwy 80 West","Demopolis","AL","36732");
        cust = new Customer("Callie","Mcdaniel",addr);
        customerList.add(cust);
        addr = new Address("3018 East Ave","Central Square","NY","13036");
        cust = new Customer("Asher","Fuller",addr);
        customerList.add(cust);
        addr = new Address("2400 Route 9","Fishkill","NY","12524");
        cust = new Customer("Harrison","Becker",addr);
        customerList.add(cust);
        addr = new Address("5335 Hwy 280 South","Hoover","AL","35242");
        cust = new Customer("Summer","Sherman",addr);
        customerList.add(cust);
        addr = new Address("1950 W Main St","Centre","AL","35960");
        cust = new Customer("Aaron","Howard",addr);
        customerList.add(cust);
        addr = new Address("145 Kelley Blvd","Millbrook","AL","36054");
        cust = new Customer("Sienna","Meyer",addr);
        customerList.add(cust);
        addr = new Address("2200 South Mckenzie St","Foley","AL","36535");
        cust = new Customer("Graham","Enriquez",addr);
        customerList.add(cust);
        addr = new Address("10675 Hwy 5","Brent","AL","35034");
        cust = new Customer("Kayla","Mcgee",addr);
        customerList.add(cust);
        addr = new Address("101 South Beltline Highway","Mobile","AL","36606");
        cust = new Customer("Eric","Schmitt",addr);
        customerList.add(cust);
        addr = new Address("2780 John Hawkins Pkwy","Hoover","AL","35244");
        cust = new Customer("Savannah","Hayden",addr);
        customerList.add(cust);
        addr = new Address("214 Haynes Street","Talladega","AL","35160");
        cust = new Customer("Abraham","Norris",addr);
        customerList.add(cust);
        addr = new Address("2055 Niagara Falls Blvd","Amherst","NY","14228");
        cust = new Customer("Zoey","Cochran",addr);
        customerList.add(cust);
        addr = new Address("626 Olive Street Sw","Cullman","AL","35055");
        cust = new Customer("Parker","May",addr);
        customerList.add(cust);
        addr = new Address("600 Boll Weevil Circle","Enterprise","AL","36330");
        cust = new Customer("James","Barton",addr);
        customerList.add(cust);
        addr = new Address("8551 Whitfield Ave","Leeds","AL","35094");
        cust = new Customer("Jude","Marin",addr);
        customerList.add(cust);
        addr = new Address("3222 State Rt 11","Malone","NY","12953");
        cust = new Customer("Olivia","Tanner",addr);
        customerList.add(cust);
        addr = new Address("750 Middle Country Road","Middle Island","NY","11953");
        cust = new Customer("Eliana","Mcdonald",addr);
        customerList.add(cust);
        addr = new Address("1608 W Magnolia Ave","Geneva","AL","36340");
        cust = new Customer("Zion","Bowen",addr);
        customerList.add(cust);
        addr = new Address("1420 Us 231 South","Troy","AL","36081");
        cust = new Customer("Bryson","Carr",addr);
        customerList.add(cust);
        addr = new Address("470 Route 211 East","Middletown","NY","10940");
        cust = new Customer("Londyn","Mcclure",addr);
        customerList.add(cust);
        addr = new Address("1706 Military Street South","Hamilton","AL","35570");
        cust = new Customer("Violet","White",addr);
        customerList.add(cust);
        addr = new Address("555 Hubbard Ave-Suite 12","Pittsfield","MA","1201");
        cust = new Customer("Ian","Barrett",addr);
        customerList.add(cust);
        addr = new Address("1600 Montclair Rd","Birmingham","AL","35210");
        cust = new Customer("Anastasia","Lang",addr);
        customerList.add(cust);
        addr = new Address("150 Barnum Avenue Cutoff","Stratford","CT","6614");
        cust = new Customer("Ella","Chen",addr);
        customerList.add(cust);
        addr = new Address("301 Falls Blvd","Quincy","MA","2169");
        cust = new Customer("Ayla","Benson",addr);
        customerList.add(cust);
        addr = new Address("220 Salem Turnpike","Norwich","CT","6360");
        cust = new Customer("Thomas","Snow",addr);
        customerList.add(cust);
        addr = new Address("495 Flatbush Ave","Hartford","CT","6106");
        cust = new Customer("Iris","Truong",addr);
        customerList.add(cust);
        addr = new Address("1625 Pelham South","Jacksonville","AL","36265");
        cust = new Customer("Lorenzo","Zamora",addr);
        customerList.add(cust);
        addr = new Address("67 Newton Rd","Danbury","CT","6810");
        cust = new Customer("Emmanuel","Branch",addr);
        customerList.add(cust);
        addr = new Address("4133 Veterans Memorial Drive","Batavia","NY","14020");
        cust = new Customer("Adrian","Jacobs",addr);
        customerList.add(cust);
        addr = new Address("3191 County rd 10","Canandaigua","NY","14424");
        cust = new Customer("Scarlett","Macias",addr);
        customerList.add(cust);
        addr = new Address("137 Teaticket Hwy","East Falmouth","MA","2536");
        cust = new Customer("Andrew","Vang",addr);
        customerList.add(cust);
        addr = new Address("13858 Rt 31 W","Albion","NY","14411");
        cust = new Customer("Faith","Mcintyre",addr);
        customerList.add(cust);
        addr = new Address("262 Swansea Mall Dr","Swansea","MA","2777");
        cust = new Customer("Joel","Middleton",addr);
        customerList.add(cust);
        addr = new Address("2041 Douglas Avenue","Brewton","AL","36426");
        cust = new Customer("Mila","Golden",addr);
        customerList.add(cust);
        addr = new Address("1300 Gilmer Ave","Tallassee","AL","36078");
        cust = new Customer("Ariana","Foley",addr);
        customerList.add(cust);
        addr = new Address("501 Willow Lane","Greenville","AL","36037");
        cust = new Customer("Josephine","Owen",addr);
        customerList.add(cust);
        addr = new Address("121 Worcester Rd","Framingham","MA","1701");
        cust = new Customer("Jason","Stephens",addr);
        customerList.add(cust);
        addr = new Address("1180 Fall River Avenue","Seekonk","MA","2771");
        cust = new Customer("Luke","Rogers",addr);
        customerList.add(cust);
        addr = new Address("970 Torringford Street","Torrington","CT","6790");
        cust = new Customer("Arabella","Klein",addr);
        customerList.add(cust);
        addr = new Address("180 North King Street","Northhampton","MA","1060");
        cust = new Customer("Parker","Cruz",addr);
        customerList.add(cust);
        addr = new Address("72 Main St","North Reading","MA","1864");
        cust = new Customer("Landon","Garner",addr);
        customerList.add(cust);
        addr = new Address("690 Hwy 78","Sumiton","AL","35148");
        cust = new Customer("Amara","Glover",addr);
        customerList.add(cust);
        addr = new Address("650 Main Ave","Norwalk","CT","6851");
        cust = new Customer("Aiden","Knapp",addr);
        customerList.add(cust);
        addr = new Address("20 Soojian Dr","Leicester","MA","1524");
        cust = new Customer("Jace","Sanders",addr);
        customerList.add(cust);
        addr = new Address("555 East Main St","Orange","MA","1364");
        cust = new Customer("Finley","Barnes",addr);
        customerList.add(cust);
        addr = new Address("7855 Moffett Rd","Semmes","AL","36575");
        cust = new Customer("Tyler","Hahn",addr);
        customerList.add(cust);
        addr = new Address("2453 2Nd Avenue East","Oneonta","AL","35121");
        cust = new Customer("Samantha","Guevara",addr);
        customerList.add(cust);
        addr = new Address("6140A Univ Drive","Huntsville","AL","35806");
        cust = new Customer("Ryker","Bernard",addr);
        customerList.add(cust);
        addr = new Address("1400 County Rd 64","Horseheads","NY","14845");
        cust = new Customer("Olivia","Oneal",addr);
        customerList.add(cust);
        addr = new Address("5100 Hwy 31","Calera","AL","35040");
        cust = new Customer("Hailey","Sexton",addr);
        customerList.add(cust);
        addr = new Address("7155 State Rt 12 S","Lowville","NY","13367");
        cust = new Customer("Jose","Oneill",addr);
        customerList.add(cust);
        addr = new Address("2181 Pelham Pkwy","Pelham","AL","35124");
        cust = new Customer("Josiah","Cohen",addr);
        customerList.add(cust);
        addr = new Address("161 Centereach Mall","Centereach","NY","11720");
        cust = new Customer("Ruby","Conner",addr);
        customerList.add(cust);
        addr = new Address("10710 Chantilly Pkwy","Montgomery","AL","36117");
        cust = new Customer("Brielle","Williams",addr);
        customerList.add(cust);
        addr = new Address("830 Curran Memorial Hwy","North Adams","MA","1247");
        cust = new Customer("Cooper","Villarreal",addr);
        customerList.add(cust);
        addr = new Address("10401 Bennett Road","Fredonia","NY","14063");
        cust = new Customer("Zachary","Perkins",addr);
        customerList.add(cust);
        addr = new Address("333 Main Street","Tewksbury","MA","1876");
        cust = new Customer("Norah","Sanford",addr);
        customerList.add(cust);
        addr = new Address("92 Plaza Lane","Oxford","AL","36203");
        cust = new Customer("Thiago","Padilla",addr);
        customerList.add(cust);
        addr = new Address("2 Gannett Dr","Johnson City","NY","13790");
        cust = new Customer("Elliana","Dunn",addr);
        customerList.add(cust);
        addr = new Address("42 Fairhaven Commons Way","Fairhaven","MA","2719");
        cust = new Customer("Ava","Stout",addr);
        customerList.add(cust);
        addr = new Address("1450 No Brindlee Mtn Pkwy","Arab","AL","35016");
        cust = new Customer("Everleigh","Murillo",addr);
        customerList.add(cust);
        addr = new Address("1105 Boston Road","Springfield","MA","1119");
        cust = new Customer("Sofia","Ballard",addr);
        customerList.add(cust);
        addr = new Address("1095 Industrial Pkwy","Saraland","AL","36571");
        cust = new Customer("Lauren","Powell",addr);
        customerList.add(cust);
        addr = new Address("2473 Hackworth Road","Adamsville","AL","35005");
        cust = new Customer("Grace","Shields",addr);
        customerList.add(cust);
        addr = new Address("701 Mcmeans Ave","Bay Minette","AL","36507");
        cust = new Customer("Vincent","Walsh",addr);
        customerList.add(cust);
        addr = new Address("506 State Road","North Dartmouth","MA","2747");
        cust = new Customer("Henry","Trejo",addr);
        customerList.add(cust);
        addr = new Address("5783 So Transit Road","Lockport","NY","14094");
        cust = new Customer("Elizabeth","Benitez",addr);
        customerList.add(cust);
        addr = new Address("2800 Spring Avn SW","Decatur","AL","35603");
        cust = new Customer("Tyler","Odonnell",addr);
        customerList.add(cust);
        addr = new Address("155 Waterford Parkway No","Waterford","CT","6385");
        cust = new Customer("Brayden","Warren",addr);
        customerList.add(cust);
        addr = new Address("2900 Pepperrell Pkwy","Opelika","AL","36801");
        cust = new Customer("Declan","Mcmillan",addr);
        customerList.add(cust);
        addr = new Address("5919 Trussville Crossings Pkwy","Birmingham","AL","35235");
        cust = new Customer("Laila","Frederick",addr);
        customerList.add(cust);
        addr = new Address("209 Lakeshore Parkway","Homewood","AL","35209");
        cust = new Customer("Alexis","Taylor",addr);
        customerList.add(cust);
        addr = new Address("3949 Route 31","Clay","NY","13041");
        cust = new Customer("Liliana","Roman",addr);
        customerList.add(cust);
        addr = new Address("844 No Colony Road","Wallingford","CT","6492");
        cust = new Customer("Riley","Lane",addr);
        customerList.add(cust);
        addr = new Address("625 School Street","Putnam","CT","6260");
        cust = new Customer("Julia","James",addr);
        customerList.add(cust);
        addr = new Address("2643 Hwy 280 West","Alexander City","AL","35010");
        cust = new Customer("Scarlett","Deleon",addr);
        customerList.add(cust);
        addr = new Address("474 Boston Post Road","North Windham","CT","6256");
        cust = new Customer("Brooklyn","Garrett",addr);
        customerList.add(cust);
        addr = new Address("150 Gold Star Hwy","Groton","CT","6340");
        cust = new Customer("Maddox","Hensley",addr);
        customerList.add(cust);
        addr = new Address("890 Odum Road","Gardendale","AL","35071");
        cust = new Customer("Maxwell","Collins",addr);
        customerList.add(cust);
        addr = new Address("4765 Commercial Drive","New Hartford","NY","13413");
        cust = new Customer("Leilani","Davila",addr);
        customerList.add(cust);
        addr = new Address("3186 Hwy 171 North","Fayette","AL","35555");
        cust = new Customer("Beau","Park",addr);
        customerList.add(cust);
        addr = new Address("900 Boston Post Road","Guilford","CT","6437");
        cust = new Customer("Aaliyah","Morrison",addr);
        customerList.add(cust);
        addr = new Address("5560 Mcclellan Blvd","Anniston","AL","36206");
        cust = new Customer("Delilah","Kline",addr);
        customerList.add(cust);
        addr = new Address("16077 Highway 280","Chelsea","AL","35043");
        cust = new Customer("Alyssa","Orr",addr);
        customerList.add(cust);
        addr = new Address("1007 Red Farmer Drive","Hueytown","AL","35023");
        cust = new Customer("Micah","Salazar",addr);
        customerList.add(cust);
        addr = new Address("5399 W Genesse St","Camillus","NY","13031");
        cust = new Customer("Tyler","Delacruz",addr);
        customerList.add(cust);
        addr = new Address("27520 Hwy 98","Daphne","AL","36526");
        cust = new Customer("Elliott","House",addr);
        customerList.add(cust);
        addr = new Address("280 Washington Street","Hudson","MA","1749");
        cust = new Customer("Caleb","Larson",addr);
        customerList.add(cust);
        addr = new Address("3005 Cranberry Hwy Rt 6 28","Wareham","MA","2538");
        cust = new Customer("Rylee","Beck",addr);
        customerList.add(cust);
        addr = new Address("315 Foxon Blvd","New Haven","CT","6513");
        cust = new Customer("Emersyn","Horn",addr);
        customerList.add(cust);
        addr = new Address("851 Ann St","Montgomery","AL","36107");
        cust = new Customer("Jonah","Garrison",addr);
        customerList.add(cust);
        addr = new Address("66-4 Parkhurst Rd","Chelmsford","MA","1824");
        cust = new Customer("Elijah","Stokes",addr);
        customerList.add(cust);
        addr = new Address("70 Pleasant Valley Street","Methuen","MA","1844");
        cust = new Customer("Finn","Sawyer",addr);
        customerList.add(cust);
        addr = new Address("200 Otis Street","Northborough","MA","1532");
        cust = new Customer("Ivy","Estes",addr);
        customerList.add(cust);
        addr = new Address("330 Sutton Rd","Huntsville","AL","35763");
        cust = new Customer("Savannah","Coffey",addr);
        customerList.add(cust);
        addr = new Address("910 Wolcott St","Waterbury","CT","6705");
        cust = new Customer("Justin","Wheeler",addr);
        customerList.add(cust);
        addr = new Address("5360 Southwestern Blvd","Hamburg","NY","14075");
        cust = new Customer("Sydney","Phan",addr);
        customerList.add(cust);
        addr = new Address("656 New Haven Ave","Derby","CT","6418");
        cust = new Customer("Matteo","Butler",addr);
        customerList.add(cust);
        addr = new Address("180 River Rd","Lisbon","CT","6351");
        cust = new Customer("Sara","Perry",addr);
        customerList.add(cust);
        addr = new Address("141 Washington Ave Extension","Albany","NY","12205");
        cust = new Customer("Layla","Warner",addr);
        customerList.add(cust);
        addr = new Address("2900 S Mem PkwyDrake Ave","Huntsville","AL","35801");
        cust = new Customer("Easton","Williamson",addr);
        customerList.add(cust);
        addr = new Address("777 Brockton Avenue","Abington","MA","2351");
        cust = new Customer("Lauren","Chang",addr);
        customerList.add(cust);
        addr = new Address("352 Palmer Road","Ware","MA","1082");
        cust = new Customer("Alexandra","Pham",addr);
        customerList.add(cust);
        addr = new Address("2465 Hempstead Turnpike","East Meadow","NY","11554");
        cust = new Customer("Jameson","Castillo",addr);
        customerList.add(cust);
        return customerList;
    }
}
