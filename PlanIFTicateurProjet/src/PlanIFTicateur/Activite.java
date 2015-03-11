/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur;

/**
 *
 * @author Charles
 */
public class Activite {
   
    private String m_codeActivite;
    private String m_sectionActivite;
    private String m_titreActivite;
    private String m_profActivite;
    private String m_typeActivite;
    private Double m_dureeActivite;
    private Double m_debutMin;
    private Double m_debutMax;
    private Double m_finMax;
    private Double m_jourActivite;
    private Double m_heureActivite;
    
    //Constructeur
    public Activite()
    {
        
    }
    
    //Méthodes get
    
    public String get_code()
        {return m_codeActivite;  }
    public String get_section()
        {return m_sectionActivite;} 
    public String get_titre()
        {return m_titreActivite;}
    public String get_prof()
        {return m_profActivite;}
    public String get_type()
        {return m_typeActivite;}
    public Double get_duree()
        {return m_dureeActivite;}
    public Double get_debutmin()
        {return m_debutMin;}
    public Double get_debutmax()
        {return m_debutMax;}
    public Double get_finmax()
        {return m_finMax;}
    public Double get_jour()
        {return m_jourActivite;}
    public Double get_heure()
        {return m_heureActivite;}
    
    
    //Méthodes set
      
    public void set_code(String p_code){
        this.m_codeActivite = p_code;
    }
    public void set_section(String p_section){
        this.m_sectionActivite = p_section;
    }
    public void set_titre(String p_titre){
        this.m_titreActivite = p_titre;
    }
    public void set_prof(String p_prof){
       this.m_profActivite = p_prof;
    }
    public void set_type(String p_type){
        this.m_typeActivite = p_type;
    }
    public void set_duree(Double p_duree){
        this.m_dureeActivite= p_duree;
    }
    public void set_debutmin(Double p_debutmin){
        this.m_debutMin = p_debutmin;
    }
    public void set_debutmax(Double p_debutmax){
        this.m_debutMax = p_debutmax;
    }
    public void set_finmax(Double p_finmax){
        this.m_finMax = p_finmax;
    }
    public void set_jour(Double p_jour){
        this.m_jourActivite = p_jour;
    }
     public void set_heure(Double p_heure){
        this.m_heureActivite = p_heure;
     }
    
}
