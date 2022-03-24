package com.kh.product.web.form;

import lombok.Data;

@Data
public class ProductForm {
//  뷰에서 입력 받을 필드
  private String pname;
  private Long pquantity;
  private int pprice;

}
