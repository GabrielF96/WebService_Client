/**
 * Exame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package models;

public class Exame  implements java.io.Serializable {
    private java.lang.String alergias;

    private java.lang.String cancer;

    private boolean diabetes;

    private boolean doenca_cardiaca;

    private boolean doenca_mental;

    private java.lang.String doencas_familiares;

    private java.lang.String dt_Exame;

    private boolean epilepsia;

    private boolean hernia;

    private long id;

    private long id_Medico;

    private long id_Paciente;

    private java.lang.String medicamentos;

    private java.lang.String outras_doencas;

    private boolean pressao_alta;

    private boolean reumatismo;

    private java.lang.String tp_Sanguineo;

    public Exame() {
    }

    public Exame(
           java.lang.String alergias,
           java.lang.String cancer,
           boolean diabetes,
           boolean doenca_cardiaca,
           boolean doenca_mental,
           java.lang.String doencas_familiares,
           java.lang.String dt_Exame,
           boolean epilepsia,
           boolean hernia,
           long id,
           long id_Medico,
           long id_Paciente,
           java.lang.String medicamentos,
           java.lang.String outras_doencas,
           boolean pressao_alta,
           boolean reumatismo,
           java.lang.String tp_Sanguineo) {
           this.alergias = alergias;
           this.cancer = cancer;
           this.diabetes = diabetes;
           this.doenca_cardiaca = doenca_cardiaca;
           this.doenca_mental = doenca_mental;
           this.doencas_familiares = doencas_familiares;
           this.dt_Exame = dt_Exame;
           this.epilepsia = epilepsia;
           this.hernia = hernia;
           this.id = id;
           this.id_Medico = id_Medico;
           this.id_Paciente = id_Paciente;
           this.medicamentos = medicamentos;
           this.outras_doencas = outras_doencas;
           this.pressao_alta = pressao_alta;
           this.reumatismo = reumatismo;
           this.tp_Sanguineo = tp_Sanguineo;
    }


    /**
     * Gets the alergias value for this Exame.
     * 
     * @return alergias
     */
    public java.lang.String getAlergias() {
        return alergias;
    }


    /**
     * Sets the alergias value for this Exame.
     * 
     * @param alergias
     */
    public void setAlergias(java.lang.String alergias) {
        this.alergias = alergias;
    }


    /**
     * Gets the cancer value for this Exame.
     * 
     * @return cancer
     */
    public java.lang.String getCancer() {
        return cancer;
    }


    /**
     * Sets the cancer value for this Exame.
     * 
     * @param cancer
     */
    public void setCancer(java.lang.String cancer) {
        this.cancer = cancer;
    }


    /**
     * Gets the diabetes value for this Exame.
     * 
     * @return diabetes
     */
    public boolean isDiabetes() {
        return diabetes;
    }


    /**
     * Sets the diabetes value for this Exame.
     * 
     * @param diabetes
     */
    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }


    /**
     * Gets the doenca_cardiaca value for this Exame.
     * 
     * @return doenca_cardiaca
     */
    public boolean isDoenca_cardiaca() {
        return doenca_cardiaca;
    }


    /**
     * Sets the doenca_cardiaca value for this Exame.
     * 
     * @param doenca_cardiaca
     */
    public void setDoenca_cardiaca(boolean doenca_cardiaca) {
        this.doenca_cardiaca = doenca_cardiaca;
    }


    /**
     * Gets the doenca_mental value for this Exame.
     * 
     * @return doenca_mental
     */
    public boolean isDoenca_mental() {
        return doenca_mental;
    }


    /**
     * Sets the doenca_mental value for this Exame.
     * 
     * @param doenca_mental
     */
    public void setDoenca_mental(boolean doenca_mental) {
        this.doenca_mental = doenca_mental;
    }


    /**
     * Gets the doencas_familiares value for this Exame.
     * 
     * @return doencas_familiares
     */
    public java.lang.String getDoencas_familiares() {
        return doencas_familiares;
    }


    /**
     * Sets the doencas_familiares value for this Exame.
     * 
     * @param doencas_familiares
     */
    public void setDoencas_familiares(java.lang.String doencas_familiares) {
        this.doencas_familiares = doencas_familiares;
    }


    /**
     * Gets the dt_Exame value for this Exame.
     * 
     * @return dt_Exame
     */
    public java.lang.String getDt_Exame() {
        return dt_Exame;
    }


    /**
     * Sets the dt_Exame value for this Exame.
     * 
     * @param dt_Exame
     */
    public void setDt_Exame(java.lang.String dt_Exame) {
        this.dt_Exame = dt_Exame;
    }


    /**
     * Gets the epilepsia value for this Exame.
     * 
     * @return epilepsia
     */
    public boolean isEpilepsia() {
        return epilepsia;
    }


    /**
     * Sets the epilepsia value for this Exame.
     * 
     * @param epilepsia
     */
    public void setEpilepsia(boolean epilepsia) {
        this.epilepsia = epilepsia;
    }


    /**
     * Gets the hernia value for this Exame.
     * 
     * @return hernia
     */
    public boolean isHernia() {
        return hernia;
    }


    /**
     * Sets the hernia value for this Exame.
     * 
     * @param hernia
     */
    public void setHernia(boolean hernia) {
        this.hernia = hernia;
    }


    /**
     * Gets the id value for this Exame.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Exame.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the id_Medico value for this Exame.
     * 
     * @return id_Medico
     */
    public long getId_Medico() {
        return id_Medico;
    }


    /**
     * Sets the id_Medico value for this Exame.
     * 
     * @param id_Medico
     */
    public void setId_Medico(long id_Medico) {
        this.id_Medico = id_Medico;
    }


    /**
     * Gets the id_Paciente value for this Exame.
     * 
     * @return id_Paciente
     */
    public long getId_Paciente() {
        return id_Paciente;
    }


    /**
     * Sets the id_Paciente value for this Exame.
     * 
     * @param id_Paciente
     */
    public void setId_Paciente(long id_Paciente) {
        this.id_Paciente = id_Paciente;
    }


    /**
     * Gets the medicamentos value for this Exame.
     * 
     * @return medicamentos
     */
    public java.lang.String getMedicamentos() {
        return medicamentos;
    }


    /**
     * Sets the medicamentos value for this Exame.
     * 
     * @param medicamentos
     */
    public void setMedicamentos(java.lang.String medicamentos) {
        this.medicamentos = medicamentos;
    }


    /**
     * Gets the outras_doencas value for this Exame.
     * 
     * @return outras_doencas
     */
    public java.lang.String getOutras_doencas() {
        return outras_doencas;
    }


    /**
     * Sets the outras_doencas value for this Exame.
     * 
     * @param outras_doencas
     */
    public void setOutras_doencas(java.lang.String outras_doencas) {
        this.outras_doencas = outras_doencas;
    }


    /**
     * Gets the pressao_alta value for this Exame.
     * 
     * @return pressao_alta
     */
    public boolean isPressao_alta() {
        return pressao_alta;
    }


    /**
     * Sets the pressao_alta value for this Exame.
     * 
     * @param pressao_alta
     */
    public void setPressao_alta(boolean pressao_alta) {
        this.pressao_alta = pressao_alta;
    }


    /**
     * Gets the reumatismo value for this Exame.
     * 
     * @return reumatismo
     */
    public boolean isReumatismo() {
        return reumatismo;
    }


    /**
     * Sets the reumatismo value for this Exame.
     * 
     * @param reumatismo
     */
    public void setReumatismo(boolean reumatismo) {
        this.reumatismo = reumatismo;
    }


    /**
     * Gets the tp_Sanguineo value for this Exame.
     * 
     * @return tp_Sanguineo
     */
    public java.lang.String getTp_Sanguineo() {
        return tp_Sanguineo;
    }


    /**
     * Sets the tp_Sanguineo value for this Exame.
     * 
     * @param tp_Sanguineo
     */
    public void setTp_Sanguineo(java.lang.String tp_Sanguineo) {
        this.tp_Sanguineo = tp_Sanguineo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exame)) return false;
        Exame other = (Exame) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alergias==null && other.getAlergias()==null) || 
             (this.alergias!=null &&
              this.alergias.equals(other.getAlergias()))) &&
            ((this.cancer==null && other.getCancer()==null) || 
             (this.cancer!=null &&
              this.cancer.equals(other.getCancer()))) &&
            this.diabetes == other.isDiabetes() &&
            this.doenca_cardiaca == other.isDoenca_cardiaca() &&
            this.doenca_mental == other.isDoenca_mental() &&
            ((this.doencas_familiares==null && other.getDoencas_familiares()==null) || 
             (this.doencas_familiares!=null &&
              this.doencas_familiares.equals(other.getDoencas_familiares()))) &&
            ((this.dt_Exame==null && other.getDt_Exame()==null) || 
             (this.dt_Exame!=null &&
              this.dt_Exame.equals(other.getDt_Exame()))) &&
            this.epilepsia == other.isEpilepsia() &&
            this.hernia == other.isHernia() &&
            this.id == other.getId() &&
            this.id_Medico == other.getId_Medico() &&
            this.id_Paciente == other.getId_Paciente() &&
            ((this.medicamentos==null && other.getMedicamentos()==null) || 
             (this.medicamentos!=null &&
              this.medicamentos.equals(other.getMedicamentos()))) &&
            ((this.outras_doencas==null && other.getOutras_doencas()==null) || 
             (this.outras_doencas!=null &&
              this.outras_doencas.equals(other.getOutras_doencas()))) &&
            this.pressao_alta == other.isPressao_alta() &&
            this.reumatismo == other.isReumatismo() &&
            ((this.tp_Sanguineo==null && other.getTp_Sanguineo()==null) || 
             (this.tp_Sanguineo!=null &&
              this.tp_Sanguineo.equals(other.getTp_Sanguineo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAlergias() != null) {
            _hashCode += getAlergias().hashCode();
        }
        if (getCancer() != null) {
            _hashCode += getCancer().hashCode();
        }
        _hashCode += (isDiabetes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDoenca_cardiaca() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDoenca_mental() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDoencas_familiares() != null) {
            _hashCode += getDoencas_familiares().hashCode();
        }
        if (getDt_Exame() != null) {
            _hashCode += getDt_Exame().hashCode();
        }
        _hashCode += (isEpilepsia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHernia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Long(getId_Medico()).hashCode();
        _hashCode += new Long(getId_Paciente()).hashCode();
        if (getMedicamentos() != null) {
            _hashCode += getMedicamentos().hashCode();
        }
        if (getOutras_doencas() != null) {
            _hashCode += getOutras_doencas().hashCode();
        }
        _hashCode += (isPressao_alta() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReumatismo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTp_Sanguineo() != null) {
            _hashCode += getTp_Sanguineo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://models", "Exame"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alergias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "alergias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "cancer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diabetes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "diabetes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doenca_cardiaca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "doenca_cardiaca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doenca_mental");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "doenca_mental"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doencas_familiares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "doencas_familiares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dt_Exame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "dt_Exame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epilepsia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "epilepsia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hernia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "hernia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_Medico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "id_Medico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_Paciente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "id_Paciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicamentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "medicamentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outras_doencas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "outras_doencas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pressao_alta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "pressao_alta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reumatismo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "reumatismo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp_Sanguineo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://models", "tp_Sanguineo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
