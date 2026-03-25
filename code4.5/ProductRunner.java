class ProductRunner {

	public static void main(String[] args) {

		ProductRepository repo = new ProductRepository();

		repo.save(new Product("Product1", "Samsung", "2025-01-01", 1000,
				ProductType.ELECTRONICS, "Seller1", WarrantyYears.ONE_YEAR, false, 1, "India"));

		repo.save(new Product("Product2", "Nike", "2025-01-02", 2000,
				ProductType.CLOTHING, "Seller2", WarrantyYears.TWO_YEARS, true, 2, "USA"));

		repo.save(new Product("Product3", "Sony", "2025-01-03", 3000,
				ProductType.ELECTRONICS, "Seller3", WarrantyYears.THREE_YEARS, false, 3, "Japan"));

		repo.save(new Product("Product4", "IKEA", "2025-01-04", 4000,
				ProductType.FURNITURE, "Seller4", WarrantyYears.FIVE_YEARS, true, 4, "Sweden"));

		repo.save(new Product("Product5", "Puma", "2025-01-05", 1500,
				ProductType.CLOTHING, "Seller5", WarrantyYears.ONE_YEAR, false, 5, "Germany"));

		repo.save(new Product("Product6", "LG", "2025-01-06", 2500,
				ProductType.ELECTRONICS, "Seller6", WarrantyYears.TWO_YEARS, true, 6, "India"));

		repo.save(new Product("Product7", "Apple", "2025-01-07", 5000,
				ProductType.ELECTRONICS, "Seller7", WarrantyYears.THREE_YEARS, false, 7, "USA"));

		repo.save(new Product("Product8", "Adidas", "2025-01-08", 1800,
				ProductType.CLOTHING, "Seller8", WarrantyYears.ONE_YEAR, true, 8, "Germany"));

		repo.save(new Product("Product9", "Panasonic", "2025-01-09", 3200,
				ProductType.ELECTRONICS, "Seller9", WarrantyYears.TWO_YEARS, false, 9, "Japan"));

		repo.save(new Product("Product10", "Godrej", "2025-01-10", 4200,
				ProductType.FURNITURE, "Seller10", WarrantyYears.FIVE_YEARS, true, 10, "India"));

		repo.save(new Product("Product11", "Brand11", "2025-01-11", 1100,
				ProductType.TOYS, "Seller11", WarrantyYears.ONE_YEAR, false, 11, "India"));

		repo.save(new Product("Product12", "Brand12", "2025-01-12", 1200,
				ProductType.FOOD, "Seller12", WarrantyYears.TWO_YEARS, true, 12, "USA"));

		repo.save(new Product("Product13", "Brand13", "2025-01-13", 1300,
				ProductType.ELECTRONICS, "Seller13", WarrantyYears.THREE_YEARS, false, 13, "China"));

		repo.save(new Product("Product14", "Brand14", "2025-01-14", 1400,
				ProductType.FURNITURE, "Seller14", WarrantyYears.FIVE_YEARS, true, 14, "India"));

		repo.save(new Product("Product15", "Brand15", "2025-01-15", 1500,
				ProductType.CLOTHING, "Seller15", WarrantyYears.ONE_YEAR, false, 15, "USA"));

		repo.save(new Product("Product16", "Brand16", "2025-01-16", 1600,
				ProductType.TOYS, "Seller16", WarrantyYears.TWO_YEARS, true, 16, "India"));

		repo.save(new Product("Product17", "Brand17", "2025-01-17", 1700,
				ProductType.FOOD, "Seller17", WarrantyYears.THREE_YEARS, false, 17, "France"));

		repo.save(new Product("Product18", "Brand18", "2025-01-18", 1800,
				ProductType.ELECTRONICS, "Seller18", WarrantyYears.FIVE_YEARS, true, 18, "Japan"));

		repo.save(new Product("Product19", "Brand19", "2025-01-19", 1900,
				ProductType.FURNITURE, "Seller19", WarrantyYears.ONE_YEAR, false, 19, "India"));

		repo.save(new Product("Product20", "Brand20", "2025-01-20", 2000,
				ProductType.CLOTHING, "Seller20", WarrantyYears.TWO_YEARS, true, 20, "USA"));

		repo.save(new Product("Product21", "Brand21", "2025-01-21", 2100,
				ProductType.TOYS, "Seller21", WarrantyYears.ONE_YEAR, false, 21, "India"));

		repo.save(new Product("Product22", "Brand22", "2025-01-22", 2200,
				ProductType.FOOD, "Seller22", WarrantyYears.TWO_YEARS, true, 22, "USA"));

		repo.save(new Product("Product23", "Brand23", "2025-01-23", 2300,
				ProductType.ELECTRONICS, "Seller23", WarrantyYears.THREE_YEARS, false, 23, "China"));

		repo.save(new Product("Product24", "Brand24", "2025-01-24", 2400,
				ProductType.FURNITURE, "Seller24", WarrantyYears.FIVE_YEARS, true, 24, "India"));

		repo.save(new Product("Product25", "Brand25", "2025-01-25", 2500,
				ProductType.CLOTHING, "Seller25", WarrantyYears.ONE_YEAR, false, 25, "USA"));

		repo.save(new Product("Product26", "Brand26", "2025-01-26", 2600,
				ProductType.TOYS, "Seller26", WarrantyYears.TWO_YEARS, true, 26, "India"));

		repo.save(new Product("Product27", "Brand27", "2025-01-27", 2700,
				ProductType.FOOD, "Seller27", WarrantyYears.THREE_YEARS, false, 27, "France"));

		repo.save(new Product("Product28", "Brand28", "2025-01-28", 2800,
				ProductType.ELECTRONICS, "Seller28", WarrantyYears.FIVE_YEARS, true, 28, "Japan"));

		repo.save(new Product("Product29", "Brand29", "2025-01-29", 2900,
				ProductType.FURNITURE, "Seller29", WarrantyYears.ONE_YEAR, false, 29, "India"));

		repo.save(new Product("Product30", "Brand30", "2025-01-30", 3000,
				ProductType.CLOTHING, "Seller30", WarrantyYears.TWO_YEARS, true, 30, "USA"));

		repo.save(new Product("Product31", "Brand31", "2025-02-01", 3100,
				ProductType.TOYS, "Seller31", WarrantyYears.THREE_YEARS, false, 31, "India"));

		repo.save(new Product("Product32", "Brand32", "2025-02-02", 3200,
				ProductType.FOOD, "Seller32", WarrantyYears.FIVE_YEARS, true, 32, "USA"));

		repo.save(new Product("Product33", "Brand33", "2025-02-03", 3300,
				ProductType.ELECTRONICS, "Seller33", WarrantyYears.ONE_YEAR, false, 33, "China"));

		repo.save(new Product("Product34", "Brand34", "2025-02-04", 3400,
				ProductType.FURNITURE, "Seller34", WarrantyYears.TWO_YEARS, true, 34, "India"));

		repo.save(new Product("Product35", "Brand35", "2025-02-05", 3500,
				ProductType.CLOTHING, "Seller35", WarrantyYears.THREE_YEARS, false, 35, "USA"));

		repo.save(new Product("Product36", "Brand36", "2025-02-06", 3600,
				ProductType.TOYS, "Seller36", WarrantyYears.FIVE_YEARS, true, 36, "India"));

		repo.save(new Product("Product37", "Brand37", "2025-02-07", 3700,
				ProductType.FOOD, "Seller37", WarrantyYears.ONE_YEAR, false, 37, "France"));

		repo.save(new Product("Product38", "Brand38", "2025-02-08", 3800,
				ProductType.ELECTRONICS, "Seller38", WarrantyYears.TWO_YEARS, true, 38, "Japan"));

		repo.save(new Product("Product39", "Brand39", "2025-02-09", 3900,
				ProductType.FURNITURE, "Seller39", WarrantyYears.THREE_YEARS, false, 39, "India"));

		repo.save(new Product("Product40", "Brand40", "2025-02-10", 4000,
				ProductType.CLOTHING, "Seller40", WarrantyYears.FIVE_YEARS, true, 40, "USA"));

        
		repo.save(new Product("Product41", "Brand41", "2025-02-11", 4100,
				ProductType.TOYS, "Seller41", WarrantyYears.ONE_YEAR, false, 41, "India"));

		repo.save(new Product("Product42", "Brand42", "2025-02-12", 4200,
				ProductType.FOOD, "Seller42", WarrantyYears.TWO_YEARS, true, 42, "USA"));

		repo.save(new Product("Product43", "Brand43", "2025-02-13", 4300,
				ProductType.ELECTRONICS, "Seller43", WarrantyYears.THREE_YEARS, false, 43, "China"));

		repo.save(new Product("Product44", "Brand44", "2025-02-14", 4400,
				ProductType.FURNITURE, "Seller44", WarrantyYears.FIVE_YEARS, true, 44, "India"));

		repo.save(new Product("Product45", "Brand45", "2025-02-15", 4500,
				ProductType.CLOTHING, "Seller45", WarrantyYears.ONE_YEAR, false, 45, "USA"));

		repo.save(new Product("Product46", "Brand46", "2025-02-16", 4600,
				ProductType.TOYS, "Seller46", WarrantyYears.TWO_YEARS, true, 46, "India"));

		repo.save(new Product("Product47", "Brand47", "2025-02-17", 4700,
				ProductType.FOOD, "Seller47", WarrantyYears.THREE_YEARS, false, 47, "France"));

		repo.save(new Product("Product48", "Brand48", "2025-02-18", 4800,
				ProductType.ELECTRONICS, "Seller48", WarrantyYears.FIVE_YEARS, true, 48, "Japan"));

		repo.save(new Product("Product49", "Brand49", "2025-02-19", 4900,
				ProductType.FURNITURE, "Seller49", WarrantyYears.ONE_YEAR, false, 49, "India"));

		repo.save(new Product("Product50", "Brand50", "2025-02-20", 5000,
				ProductType.CLOTHING, "Seller50", WarrantyYears.TWO_YEARS, true, 50, "USA"));

		repo.save(new Product("Product51", "Brand51", "2025-02-21", 5100,
				ProductType.TOYS, "Seller51", WarrantyYears.THREE_YEARS, false, 51, "India"));

		repo.save(new Product("Product52", "Brand52", "2025-02-22", 5200,
				ProductType.FOOD, "Seller52", WarrantyYears.FIVE_YEARS, true, 52, "USA"));

		repo.save(new Product("Product53", "Brand53", "2025-02-23", 5300,
				ProductType.ELECTRONICS, "Seller53", WarrantyYears.ONE_YEAR, false, 53, "China"));

		repo.save(new Product("Product54", "Brand54", "2025-02-24", 5400,
				ProductType.FURNITURE, "Seller54", WarrantyYears.TWO_YEARS, true, 54, "India"));

		repo.save(new Product("Product55", "Brand55", "2025-02-25", 5500,
				ProductType.CLOTHING, "Seller55", WarrantyYears.THREE_YEARS, false, 55, "USA"));

		repo.save(new Product("Product56", "Brand56", "2025-02-26", 5600,
				ProductType.TOYS, "Seller56", WarrantyYears.FIVE_YEARS, true, 56, "India"));

		repo.save(new Product("Product57", "Brand57", "2025-02-27", 5700,
				ProductType.FOOD, "Seller57", WarrantyYears.ONE_YEAR, false, 57, "France"));

		repo.save(new Product("Product58", "Brand58", "2025-02-28", 5800,
				ProductType.ELECTRONICS, "Seller58", WarrantyYears.TWO_YEARS, true, 58, "Japan"));

		repo.save(new Product("Product59", "Brand59", "2025-03-01", 5900,
				ProductType.FURNITURE, "Seller59", WarrantyYears.THREE_YEARS, false, 59, "India"));

		repo.save(new Product("Product60", "Brand60", "2025-03-02", 6000,
				ProductType.CLOTHING, "Seller60", WarrantyYears.FIVE_YEARS, true, 60, "USA"));

		repo.save(new Product("Product61", "Brand61", "2025-03-03", 6100,
				ProductType.TOYS, "Seller61", WarrantyYears.ONE_YEAR, false, 61, "India"));

		repo.save(new Product("Product62", "Brand62", "2025-03-04", 6200,
				ProductType.FOOD, "Seller62", WarrantyYears.TWO_YEARS, true, 62, "USA"));

		repo.save(new Product("Product63", "Brand63", "2025-03-05", 6300,
				ProductType.ELECTRONICS, "Seller63", WarrantyYears.THREE_YEARS, false, 63, "China"));

		repo.save(new Product("Product64", "Brand64", "2025-03-06", 6400,
				ProductType.FURNITURE, "Seller64", WarrantyYears.FIVE_YEARS, true, 64, "India"));

		repo.save(new Product("Product65", "Brand65", "2025-03-07", 6500,
				ProductType.CLOTHING, "Seller65", WarrantyYears.ONE_YEAR, false, 65, "USA"));

		repo.save(new Product("Product66", "Brand66", "2025-03-08", 6600,
				ProductType.TOYS, "Seller66", WarrantyYears.TWO_YEARS, true, 66, "India"));

		repo.save(new Product("Product67", "Brand67", "2025-03-09", 6700,
				ProductType.FOOD, "Seller67", WarrantyYears.THREE_YEARS, false, 67, "France"));

		repo.save(new Product("Product68", "Brand68", "2025-03-10", 6800,
				ProductType.ELECTRONICS, "Seller68", WarrantyYears.FIVE_YEARS, true, 68, "Japan"));

		repo.save(new Product("Product69", "Brand69", "2025-03-11", 6900,
				ProductType.FURNITURE, "Seller69", WarrantyYears.ONE_YEAR, false, 69, "India"));

		repo.save(new Product("Product70", "Brand70", "2025-03-12", 7000,
				ProductType.CLOTHING, "Seller70", WarrantyYears.TWO_YEARS, true, 70, "USA"));

		repo.save(new Product("Product71", "Brand71", "2025-03-13", 7100,
				ProductType.TOYS, "Seller71", WarrantyYears.THREE_YEARS, false, 71, "India"));

		repo.save(new Product("Product72", "Brand72", "2025-03-14", 7200,
				ProductType.FOOD, "Seller72", WarrantyYears.FIVE_YEARS, true, 72, "USA"));

		repo.save(new Product("Product73", "Brand73", "2025-03-15", 7300,
				ProductType.ELECTRONICS, "Seller73", WarrantyYears.ONE_YEAR, false, 73, "China"));

		repo.save(new Product("Product74", "Brand74", "2025-03-16", 7400,
				ProductType.FURNITURE, "Seller74", WarrantyYears.TWO_YEARS, true, 74, "India"));

		repo.save(new Product("Product75", "Brand75", "2025-03-17", 7500,
				ProductType.CLOTHING, "Seller75", WarrantyYears.THREE_YEARS, false, 75, "USA"));

		repo.save(new Product("Product76", "Brand76", "2025-03-18", 7600,
				ProductType.TOYS, "Seller76", WarrantyYears.FIVE_YEARS, true, 76, "India"));

		repo.save(new Product("Product77", "Brand77", "2025-03-19", 7700,
				ProductType.FOOD, "Seller77", WarrantyYears.ONE_YEAR, false, 77, "France"));

		repo.save(new Product("Product78", "Brand78", "2025-03-20", 7800,
				ProductType.ELECTRONICS, "Seller78", WarrantyYears.TWO_YEARS, true, 78, "Japan"));

		repo.save(new Product("Product79", "Brand79", "2025-03-21", 7900,
				ProductType.FURNITURE, "Seller79", WarrantyYears.THREE_YEARS, false, 79, "India"));

		repo.save(new Product("Product80", "Brand80", "2025-03-22", 8000,
				ProductType.CLOTHING, "Seller80", WarrantyYears.FIVE_YEARS, true, 80, "USA"));

		repo.save(new Product("Product81", "Brand81", "2025-03-23", 8100,
				ProductType.TOYS, "Seller81", WarrantyYears.ONE_YEAR, false, 81, "India"));

		repo.save(new Product("Product82", "Brand82", "2025-03-24", 8200,
				ProductType.FOOD, "Seller82", WarrantyYears.TWO_YEARS, true, 82, "USA"));

		repo.save(new Product("Product83", "Brand83", "2025-03-25", 8300,
				ProductType.ELECTRONICS, "Seller83", WarrantyYears.THREE_YEARS, false, 83, "China"));

		repo.save(new Product("Product84", "Brand84", "2025-03-26", 8400,
				ProductType.FURNITURE, "Seller84", WarrantyYears.FIVE_YEARS, true, 84, "India"));

		repo.save(new Product("Product85", "Brand85", "2025-03-27", 8500,
				ProductType.CLOTHING, "Seller85", WarrantyYears.ONE_YEAR, false, 85, "USA"));

		repo.save(new Product("Product86", "Brand86", "2025-03-28", 8600,
				ProductType.TOYS, "Seller86", WarrantyYears.TWO_YEARS, true, 86, "India"));

		repo.save(new Product("Product87", "Brand87", "2025-03-29", 8700,
				ProductType.FOOD, "Seller87", WarrantyYears.THREE_YEARS, false, 87, "France"));

		repo.save(new Product("Product88", "Brand88", "2025-03-30", 8800,
				ProductType.ELECTRONICS, "Seller88", WarrantyYears.FIVE_YEARS, true, 88, "Japan"));

		repo.save(new Product("Product89", "Brand89", "2025-03-31", 8900,
				ProductType.FURNITURE, "Seller89", WarrantyYears.ONE_YEAR, false, 89, "India"));

		repo.save(new Product("Product90", "Brand90", "2025-04-01", 9000,
				ProductType.CLOTHING, "Seller90", WarrantyYears.TWO_YEARS, true, 90, "USA"));

		repo.save(new Product("Product91", "Brand91", "2025-04-02", 9100,
				ProductType.TOYS, "Seller91", WarrantyYears.THREE_YEARS, false, 91, "India"));

		repo.save(new Product("Product92", "Brand92", "2025-04-03", 9200,
				ProductType.FOOD, "Seller92", WarrantyYears.FIVE_YEARS, true, 92, "USA"));

		repo.save(new Product("Product93", "Brand93", "2025-04-04", 9300,
				ProductType.ELECTRONICS, "Seller93", WarrantyYears.ONE_YEAR, false, 93, "China"));

		repo.save(new Product("Product94", "Brand94", "2025-04-05", 9400,
				ProductType.FURNITURE, "Seller94", WarrantyYears.TWO_YEARS, true, 94, "India"));

		repo.save(new Product("Product95", "Brand95", "2025-04-06", 9500,
				ProductType.CLOTHING, "Seller95", WarrantyYears.THREE_YEARS, false, 95, "USA"));

		repo.save(new Product("Product96", "Brand96", "2025-04-07", 9600,
				ProductType.TOYS, "Seller96", WarrantyYears.FIVE_YEARS, true, 96, "India"));

		repo.save(new Product("Product97", "Brand97", "2025-04-08", 9700,
				ProductType.FOOD, "Seller97", WarrantyYears.ONE_YEAR, false, 97, "France"));

		repo.save(new Product("Product98", "Brand98", "2025-04-09", 9800,
				ProductType.ELECTRONICS, "Seller98", WarrantyYears.TWO_YEARS, true, 98, "Japan"));

		repo.save(new Product("Product99", "Brand99", "2025-04-10", 9900,
				ProductType.FURNITURE, "Seller99", WarrantyYears.THREE_YEARS, false, 99, "India"));

		repo.save(new Product("Product100", "Brand100", "2025-04-11", 10000,
				ProductType.CLOTHING, "Seller100", WarrantyYears.FIVE_YEARS, true, 100, "USA"));

		repo.save(new Product("Product101", "Brand101", "2025-04-12", 10100,
				ProductType.TOYS, "Seller101", WarrantyYears.ONE_YEAR, false, 101, "India"));

		repo.save(new Product("Product102", "Brand102", "2025-04-13", 10200,
				ProductType.FOOD, "Seller102", WarrantyYears.TWO_YEARS, true, 102, "USA"));

		repo.save(new Product("Product103", "Brand103", "2025-04-14", 10300,
				ProductType.ELECTRONICS, "Seller103", WarrantyYears.THREE_YEARS, false, 103, "China"));

		repo.save(new Product("Product104", "Brand104", "2025-04-15", 10400,
				ProductType.FURNITURE, "Seller104", WarrantyYears.FIVE_YEARS, true, 104, "India"));

		repo.save(new Product("Product105", "Brand105", "2025-04-16", 10500,
				ProductType.CLOTHING, "Seller105", WarrantyYears.ONE_YEAR, false, 105, "USA"));

		repo.save(new Product("Product106", "Brand106", "2025-04-17", 10600,
				ProductType.TOYS, "Seller106", WarrantyYears.TWO_YEARS, true, 106, "India"));

		repo.save(new Product("Product107", "Brand107", "2025-04-18", 10700,
				ProductType.FOOD, "Seller107", WarrantyYears.THREE_YEARS, false, 107, "France"));

		repo.save(new Product("Product108", "Brand108", "2025-04-19", 10800,
				ProductType.ELECTRONICS, "Seller108", WarrantyYears.FIVE_YEARS, true, 108, "Japan"));

		repo.save(new Product("Product109", "Brand109", "2025-04-20", 10900,
				ProductType.FURNITURE, "Seller109", WarrantyYears.ONE_YEAR, false, 109, "India"));

		repo.save(new Product("Product110", "Brand110", "2025-04-21", 11000,
				ProductType.CLOTHING, "Seller110", WarrantyYears.TWO_YEARS, true, 110, "USA"));

		repo.save(new Product("Product111", "Brand111", "2025-04-22", 11100,
				ProductType.TOYS, "Seller111", WarrantyYears.THREE_YEARS, false, 111, "India"));

		repo.save(new Product("Product112", "Brand112", "2025-04-23", 11200,
				ProductType.FOOD, "Seller112", WarrantyYears.FIVE_YEARS, true, 112, "USA"));

		repo.save(new Product("Product113", "Brand113", "2025-04-24", 11300,
				ProductType.ELECTRONICS, "Seller113", WarrantyYears.ONE_YEAR, false, 113, "China"));

		repo.save(new Product("Product114", "Brand114", "2025-04-25", 11400,
				ProductType.FURNITURE, "Seller114", WarrantyYears.TWO_YEARS, true, 114, "India"));

		repo.save(new Product("Product115", "Brand115", "2025-04-26", 11500,
				ProductType.CLOTHING, "Seller115", WarrantyYears.THREE_YEARS, false, 115, "USA"));

		repo.save(new Product("Product116", "Brand116", "2025-04-27", 11600,
				ProductType.TOYS, "Seller116", WarrantyYears.FIVE_YEARS, true, 116, "India"));

		repo.save(new Product("Product117", "Brand117", "2025-04-28", 11700,
				ProductType.FOOD, "Seller117", WarrantyYears.ONE_YEAR, false, 117, "France"));

		repo.save(new Product("Product118", "Brand118", "2025-04-29", 11800,
				ProductType.ELECTRONICS, "Seller118", WarrantyYears.TWO_YEARS, true, 118, "Japan"));

		repo.save(new Product("Product119", "Brand119", "2025-04-30", 11900,
				ProductType.FURNITURE, "Seller119", WarrantyYears.THREE_YEARS, false, 119, "India"));

		repo.save(new Product("Product120", "Brand120", "2025-05-01", 12000,
				ProductType.CLOTHING, "Seller120", WarrantyYears.FIVE_YEARS, true, 120, "USA"));

		repo.save(new Product("Product121", "Brand121", "2025-05-02", 12100,
				ProductType.TOYS, "Seller121", WarrantyYears.ONE_YEAR, false, 121, "India"));

		repo.save(new Product("Product122", "Brand122", "2025-05-03", 12200,
				ProductType.FOOD, "Seller122", WarrantyYears.TWO_YEARS, true, 122, "USA"));

		repo.save(new Product("Product123", "Brand123", "2025-05-04", 12300,
				ProductType.ELECTRONICS, "Seller123", WarrantyYears.THREE_YEARS, false, 123, "China"));

		repo.save(new Product("Product124", "Brand124", "2025-05-05", 12400,
				ProductType.FURNITURE, "Seller124", WarrantyYears.FIVE_YEARS, true, 124, "India"));

		repo.save(new Product("Product125", "Brand125", "2025-05-06", 12500,
				ProductType.CLOTHING, "Seller125", WarrantyYears.ONE_YEAR, false, 125, "USA"));

		repo.save(new Product("Product126", "Brand126", "2025-05-07", 12600,
				ProductType.TOYS, "Seller126", WarrantyYears.TWO_YEARS, true, 126, "India"));

		repo.save(new Product("Product127", "Brand127", "2025-05-08", 12700,
				ProductType.FOOD, "Seller127", WarrantyYears.THREE_YEARS, false, 127, "France"));

		repo.save(new Product("Product128", "Brand128", "2025-05-09", 12800,
				ProductType.ELECTRONICS, "Seller128", WarrantyYears.FIVE_YEARS, true, 128, "Japan"));

		repo.save(new Product("Product129", "Brand129", "2025-05-10", 12900,
				ProductType.FURNITURE, "Seller129", WarrantyYears.ONE_YEAR, false, 129, "India"));

		repo.save(new Product("Product130", "Brand130", "2025-05-11", 13000,
				ProductType.CLOTHING, "Seller130", WarrantyYears.TWO_YEARS, true, 130, "USA"));

		repo.save(new Product("Product131", "Brand131", "2025-05-12", 13100,
				ProductType.TOYS, "Seller131", WarrantyYears.THREE_YEARS, false, 131, "India"));

		repo.save(new Product("Product132", "Brand132", "2025-05-13", 13200,
				ProductType.FOOD, "Seller132", WarrantyYears.FIVE_YEARS, true, 132, "USA"));

		repo.save(new Product("Product133", "Brand133", "2025-05-14", 13300,
				ProductType.ELECTRONICS, "Seller133", WarrantyYears.ONE_YEAR, false, 133, "China"));

		repo.save(new Product("Product134", "Brand134", "2025-05-15", 13400,
				ProductType.FURNITURE, "Seller134", WarrantyYears.TWO_YEARS, true, 134, "India"));

		repo.save(new Product("Product135", "Brand135", "2025-05-16", 13500,
				ProductType.CLOTHING, "Seller135", WarrantyYears.THREE_YEARS, false, 135, "USA"));

		repo.save(new Product("Product136", "Brand136", "2025-05-17", 13600,
				ProductType.TOYS, "Seller136", WarrantyYears.FIVE_YEARS, true, 136, "India"));

		repo.save(new Product("Product137", "Brand137", "2025-05-18", 13700,
				ProductType.FOOD, "Seller137", WarrantyYears.ONE_YEAR, false, 137, "France"));
				

		
		for (int i = 1; i <= 137; i++) {

			Product p = new Product(
				"Product" + i,
				"Brand" + i,
				"2025-01-" + (i % 30 + 1),
				1000 + i,
				ProductType.values()[i % 5],
				"Seller" + i,
				WarrantyYears.values()[i % 4],
				i % 2 == 0,
				i,
				(i % 2 == 0) ? "India" : "USA"
			);

			repo.save(p);
		}



		System.out.println("---- Search By ID ----");
		Product p1 = repo.searchByUniqueId(10);
		if (p1 != null) p1.display();

		System.out.println("---- Search By ID + Name ----");
		Product p2 = repo.searchByUniqueIdAndName(20, "Product20");
		if (p2 != null) p2.display();

		System.out.println("---- Search By All ----");
		Product p3 = repo.searchByUniqueIdAndNameAndOriginCountry(30, "Product30", "India");
		if (p3 != null) p3.display();

		System.out.println("---- All Countries ----");
		repo.getAllOriginCountry();

		System.out.println("---- Warranty Check ----");
		repo.checkWarrantyExpiredByUniqueId(5);

		System.out.println("---- Products By Type ----");
		repo.getAllByType(ProductType.ELECTRONICS);

		System.out.println("---- Products By Warranty ----");
		repo.getAllByWarrantyYears(WarrantyYears.ONE_YEAR);

		System.out.println("---- Display All ----");
		repo.displayAllProducts();epo.displayAllProducts();
	}
}