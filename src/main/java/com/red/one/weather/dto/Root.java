package com.red.one.weather.dto;

public class Root{
  private Embedded _embedded;
  private Links4 _links;
  private Page page;

  public Embedded get_embedded() {
    return _embedded;
  }

  public void set_embedded(Embedded _embedded) {
    this._embedded = _embedded;
  }

  public Links4 get_links() {
    return _links;
  }

  public void set_links(Links4 _links) {
    this._links = _links;
  }

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }
}

