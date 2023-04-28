package core;
import java.util.*;
public class Tour {
	private int tourID;
	private String tourName;
	private ArrayList<String> tourImage;
	private double tourPrice;
	private double tourDiscountPrice;
	private short tourVisited; // lượt xem
	private HashMap<Integer, String> tourLike;
	private short tourRatings;
	private String tourDurationTime; // hành trình tour
	private HashMap<Integer, ArrayList<String>> tourDayDetail; // chi tiết theo từng ngày
	private TRANSPORT tourTransport; // phương tiện di chuyển
	private EAT tourEat; // ăn 
}
enum TRANSPORT {
	CAR,
	MOTO,
	TRAIN,
	FLY
}
enum EAT {
	
}
