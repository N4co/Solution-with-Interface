package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

        private Integer number;
		private Date date;
		private Double totalvalue;
		
		private List<Installment> installments = new ArrayList<>();

		public Contract(Integer number, Date date, Double totalvalue) {
			super();
			this.number = number;
			this.date = date;
			this.totalvalue = totalvalue;
			
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public  Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Double getTotalvalue() {
			return totalvalue;
		}

		public void setTotalvalue(Double totalvalue) {
			this.totalvalue = totalvalue;
		}

		public List<Installment> getInstallments() {
			return installments;
		}
	   public void addInstallment(Installment installment) {
	    installments.add(installment);
	   }
	   public void removeInstallment(Installment installment) {
	     installments.remove(installment);
	   
	   }
	}
	   

