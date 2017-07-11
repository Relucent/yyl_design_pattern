package yyl.example.design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 * @see java.util.Observable
 */
public abstract class Subject {

	/** 用来保存注册的观察者对象 */
	private final List<Observer> list = new ArrayList<Observer>();

	/**
	 * 注册观察者对象
	 * @param observer 观察者对象
	 */
	public synchronized void addObserver(Observer observer) {
		list.add(observer);
	}

	/**
	 * 删除观察者对象
	 * @param observer 观察者对象
	 */
	public synchronized void deleteObserver(Observer observer) {
		list.remove(observer);
	}

	/**
	 * 通知所有注册的观察者对象
	 */
	public void nodifyObservers(String newState) {
		for (Observer observer : list) {
			observer.update(newState);
		}
	}
}
