public class UserManager extends BaseManager{
	@Override
	public void add() {
		System.out.println("kullan�c� bilgileri eklendi");
	}
	public void update() {
		System.out.println("kullan�c� bilgileri guncellendi");
	}
	public void delete() {
		System.out.println("kullan�c� bilgileri silindi");
	}
}
