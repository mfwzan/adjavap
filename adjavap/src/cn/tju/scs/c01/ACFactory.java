package cn.tju.scs.c01;

abstract class Factory{
	public abstract Product manufacture();
}

abstract class Product{
	public abstract void show();
}

class ProductA extends Product{
	@Override
	public void show() {
		System.out.println("produce productA");
	}
}

class ProductB extends Product{
	@Override
	public void show() {
		System.out.println("produce productB");
	}
}

class FactoryA extends Factory{
	@Override
	public Product manufacture() {
		return new ProductA();
	}
}

class FactoryB extends Factory{
	@Override
	public Product manufacture() {
		return new ProductB();
	}
}

class FactoryType{
	public Factory getFactory(String factoryType){
		if(factoryType == null){
			return null;
		}
		
		if (factoryType.equals("FactoryA")){
			return new FactoryA();
		} else if(factoryType.equals("FactoryB")){
			return new FactoryB();
		}
		return null;
	}
}

public class ACFactory {

	public static void main(String[] args) {
		FactoryType factoryType = new FactoryType();
		
		Factory factory = factoryType.getFactory("FactoryB");
		factory.manufacture().show();

	}

}
