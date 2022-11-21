package com.example.ruleengine.customer;

import java.util.concurrent.atomic.AtomicLong;

public class CustomerProfile {
 /* private static final AtomicLong ID_GEN = new AtomicLong();

  *//** Person ID (indexed). *//*
  @QuerySqlField(index = true)
  public Long id;

  *//** Organization ID (indexed). *//*
  @QuerySqlField(index = true)
  public Long orgId;

  *//** First name (not-indexed). *//*
  @QuerySqlField
  public String firstName;

  *//** Last name (not indexed). *//*
  @QuerySqlField
  public String lastName;

  *//** Resume text (create LUCENE-based TEXT index for this field). *//*
  @QueryTextField
  public String resume;

  *//** Salary (indexed). *//*
  @QuerySqlField(index = true)
  public double salary;

  *//** Custom cache key to guarantee that person is always collocated with its organization. *//*
  private transient AffinityKey<Long> key;

  *//**
   * Default constructor.
   *//*
  public CustomerProfile() {
    // No-op.
  }

  *//**
   * Constructs person record.
   *
   * @param firstName First name.
   * @param lastName  Last name.
   * @param salary    Salary.
   * @param resume    Resume text.
   *//*
  public CustomerProfile(String firstName, String lastName, double salary, String resume) {
    id = ID_GEN.incrementAndGet();
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.resume = resume;
  }

  public CustomerProfile(Long id, String firstName, String lastName, double salary, String resume) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.resume = resume;
  }

  public CustomerProfile(Long id, String firstName, String lastName) {
    this.id = id;

    this.firstName = firstName;
    this.lastName = lastName;
  }

  public AffinityKey<Long> key() {
    if (key == null)
      key = new AffinityKey<>(id, orgId);

    return key;
  }

  @Override public String toString() {
    return "Person [id=" + id +
      ", orgId=" + orgId +
      ", lastName=" + lastName +
      ", firstName=" + firstName +
      ", salary=" + salary +
      ", resume=" + resume + ']';
  }
*/
}
