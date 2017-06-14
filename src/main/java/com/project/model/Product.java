package com.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "*Укажите название продукта на 100 гр")
	private String name;
	@Column(name = "proteins")
	@NotEmpty(message = "*Укажите количество белков на 100 гр")
	private float proteins;
	@Column(name = "fats")
	@NotEmpty(message = "*Укажите количество жиров на 100 гр")
	private float fats;
	@Column(name = "carbohydrates")
	@NotEmpty(message = "*Укажите количество углеводов на 100 гр")
	private float carbohydrates;
	@Column(name = "calories")
	@NotEmpty(message = "*Укажите количество калорий на 100 гр")
	private float calories;
	@Column(name = "bread_units")
	@NotEmpty(message = "*Укажите количество хлебных единиц на 100 гр")
	private float bread_units;
	@Column(name = "food_fibers")
	@NotEmpty(message = "*Укажите количество пищевых волокон на 100 гр")
	private float food_fibers;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<ProductCategory> categories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getProteins() {
		return proteins;
	}

	public void setProteins(float proteins) {
		this.proteins = proteins;
	}

	public float getFats() {
		return fats;
	}

	public void setFats(float fats) {
		this.fats = fats;
	}

	public float getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(float carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public float getCalories() {
		return calories;
	}

	public void setCalories(float calories) {
		this.calories = calories;
	}

	public float getBread_units() {
		return bread_units;
	}

	public void setBread_units(float bread_units) {
		this.bread_units = bread_units;
	}

	public float getFood_fibers() {
		return food_fibers;
	}

	public void setFood_fibers(float food_fibers) {
		this.food_fibers = food_fibers;
	}

	public Set<ProductCategory> getCategories() {
		return categories;
	}

	public void setCategories(Set<ProductCategory> categories) {
		this.categories = categories;
	}
}
