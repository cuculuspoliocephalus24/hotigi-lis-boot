package com.hotogislab;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TrainingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contributorName;
    private String fighterName;
    private String supporter1;
    private String supporter2;
    private String supporter3;
    private String supporter4;
    private String supporter5;
    private String sceneCard1;
    private String sceneCard2;
    private String sceneCard3;
    private Integer supporter1Level;
    private Integer supporter2Level;
    private Integer supporter3Level;
    private Integer supporter4Level;
    private Integer supporter5Level;
    private Integer fighterLevel;

    private Integer sceneCard1Level;

    private Integer sceneCard2Level;

    private Integer sceneCard3Level;
    
    private String equipment1;
    private String equipment2;
    private String equipment3;
    private String equipment1Sub1Name;
    private double equipment1Sub1Value;

    private String equipment1Sub2Name;
    private double equipment1Sub2Value;

    private String equipment1Sub3Name;
    private double equipment1Sub3Value;
    
 // 補助器具2
    private String equipment2Sub1Name;
    private double equipment2Sub1Value;

    private String equipment2Sub2Name;
    private double equipment2Sub2Value;

    private String equipment2Sub3Name;
    private double equipment2Sub3Value;


    // 補助器具3
    private String equipment3Sub1Name;
    private double equipment3Sub1Value;

    private String equipment3Sub2Name;
    private double equipment3Sub2Value;

    private String equipment3Sub3Name;
    private double equipment3Sub3Value;
    
    private int startStrength;
    private int startStamina;
    private int startTechnique;
    private int startToughness;
    private int startAgility;
    private int startMental;
    
    private int strength;
    private int stamina;
    private int technique;
    private int toughness;
    private int agility;
    private int mental;

    private String comment;
    
    public TrainingRecord() {
    }

    public Long getId() {
        return id;
    }

    public String getContributorName() {
        return contributorName;
    }

    public void setContributorName(String contributorName) {
        this.contributorName = contributorName;
    }

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public int getStartStrength() {
        return startStrength;
    }

    public void setStartStrength(int startStrength) {
        this.startStrength = startStrength;
    }

    public int getStartStamina() {
        return startStamina;
    }

    public void setStartStamina(int startStamina) {
        this.startStamina = startStamina;
    }

    public int getStartTechnique() {
        return startTechnique;
    }

    public void setStartTechnique(int startTechnique) {
        this.startTechnique = startTechnique;
    }

    public int getStartToughness() {
        return startToughness;
    }

    public void setStartToughness(int startToughness) {
        this.startToughness = startToughness;
    }

    public int getStartAgility() {
        return startAgility;
    }

    public void setStartAgility(int startAgility) {
        this.startAgility = startAgility;
    }

    public int getStartMental() {
        return startMental;
    }

    public void setStartMental(int startMental) {
        this.startMental = startMental;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getTechnique() {
        return technique;
    }

    public void setTechnique(int technique) {
        this.technique = technique;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getStartTotalStatus() {
        return startStrength
                + startStamina
                + startTechnique
                + startToughness
                + startAgility
                + startMental;
    }

    public int getTotalStatus() {
        return strength
                + stamina
                + technique
                + toughness
                + agility
                + mental;
    }

    public int getGainTotalStatus() {
        return getTotalStatus() - getStartTotalStatus();
    }
    public String getSupporter1() {
        return supporter1;
    }

    public void setSupporter1(String supporter1) {
        this.supporter1 = supporter1;
    }

    public String getSupporter2() {
        return supporter2;
    }

    public void setSupporter2(String supporter2) {
        this.supporter2 = supporter2;
    }

    public String getSupporter3() {
        return supporter3;
    }

    public void setSupporter3(String supporter3) {
        this.supporter3 = supporter3;
    }

    public String getSupporter4() {
        return supporter4;
    }

    public void setSupporter4(String supporter4) {
        this.supporter4 = supporter4;
    }

    public String getSupporter5() {
        return supporter5;
    }

    public void setSupporter5(String supporter5) {
        this.supporter5 = supporter5;
    }
    public String getSceneCard1() {
        return sceneCard1;
    }

    public void setSceneCard1(String sceneCard1) {
        this.sceneCard1 = sceneCard1;
    }

    public String getSceneCard2() {
        return sceneCard2;
    }

    public void setSceneCard2(String sceneCard2) {
        this.sceneCard2 = sceneCard2;
    }

    public String getSceneCard3() {
        return sceneCard3;
    }

    public void setSceneCard3(String sceneCard3) {
        this.sceneCard3 = sceneCard3;
    }
    public String getEquipment1() {
        return equipment1;
    }

    public void setEquipment1(String equipment1) {
        this.equipment1 = equipment1;
    }

    public String getEquipment2() {
        return equipment2;
    }

    public void setEquipment2(String equipment2) {
        this.equipment2 = equipment2;
    }

    public String getEquipment3() {
        return equipment3;
    }

    public void setEquipment3(String equipment3) {
        this.equipment3 = equipment3;
    }
    public String getEquipment1Sub1Name() {
        return equipment1Sub1Name;
    }

    public void setEquipment1Sub1Name(String equipment1Sub1Name) {
        this.equipment1Sub1Name = equipment1Sub1Name;
    }

    public double getEquipment1Sub1Value() {
        return equipment1Sub1Value;
    }

    public void setEquipment1Sub1Value(double equipment1Sub1Value) {
        this.equipment1Sub1Value = equipment1Sub1Value;
    }


    public String getEquipment1Sub2Name() {
        return equipment1Sub2Name;
    }

    public void setEquipment1Sub2Name(String equipment1Sub2Name) {
        this.equipment1Sub2Name = equipment1Sub2Name;
    }

    public double getEquipment1Sub2Value() {
        return equipment1Sub2Value;
    }

    public void setEquipment1Sub2Value(double equipment1Sub2Value) {
        this.equipment1Sub2Value = equipment1Sub2Value;
    }


    public String getEquipment1Sub3Name() {
        return equipment1Sub3Name;
    }

    public void setEquipment1Sub3Name(String equipment1Sub3Name) {
        this.equipment1Sub3Name = equipment1Sub3Name;
    }

    public double getEquipment1Sub3Value() {
        return equipment1Sub3Value;
    }

    public void setEquipment1Sub3Value(double equipment1Sub3Value) {
        this.equipment1Sub3Value = equipment1Sub3Value;
    }
 // ====================
 // 補助器具2 サブ能力
 // ====================

 public String getEquipment2Sub1Name() {
     return equipment2Sub1Name;
 }

 public void setEquipment2Sub1Name(String equipment2Sub1Name) {
     this.equipment2Sub1Name = equipment2Sub1Name;
 }

 public double getEquipment2Sub1Value() {
     return equipment2Sub1Value;
 }

 public void setEquipment2Sub1Value(double equipment2Sub1Value) {
     this.equipment2Sub1Value = equipment2Sub1Value;
 }


 public String getEquipment2Sub2Name() {
     return equipment2Sub2Name;
 }

 public void setEquipment2Sub2Name(String equipment2Sub2Name) {
     this.equipment2Sub2Name = equipment2Sub2Name;
 }

 public double getEquipment2Sub2Value() {
     return equipment2Sub2Value;
 }

 public void setEquipment2Sub2Value(double equipment2Sub2Value) {
     this.equipment2Sub2Value = equipment2Sub2Value;
 }


 public String getEquipment2Sub3Name() {
     return equipment2Sub3Name;
 }

 public void setEquipment2Sub3Name(String equipment2Sub3Name) {
     this.equipment2Sub3Name = equipment2Sub3Name;
 }

 public double getEquipment2Sub3Value() {
     return equipment2Sub3Value;
 }

 public void setEquipment2Sub3Value(double equipment2Sub3Value) {
     this.equipment2Sub3Value = equipment2Sub3Value;
 }


 // ====================
 // 補助器具3 サブ能力
 // ====================

 public String getEquipment3Sub1Name() {
     return equipment3Sub1Name;
 }

 public void setEquipment3Sub1Name(String equipment3Sub1Name) {
     this.equipment3Sub1Name = equipment3Sub1Name;
 }

 public double getEquipment3Sub1Value() {
     return equipment3Sub1Value;
 }

 public void setEquipment3Sub1Value(double equipment3Sub1Value) {
     this.equipment3Sub1Value = equipment3Sub1Value;
 }


 public String getEquipment3Sub2Name() {
     return equipment3Sub2Name;
 }

 public void setEquipment3Sub2Name(String equipment3Sub2Name) {
     this.equipment3Sub2Name = equipment3Sub2Name;
 }

 public double getEquipment3Sub2Value() {
     return equipment3Sub2Value;
 }

 public void setEquipment3Sub2Value(double equipment3Sub2Value) {
     this.equipment3Sub2Value = equipment3Sub2Value;
 }


 public String getEquipment3Sub3Name() {
     return equipment3Sub3Name;
 }

 public void setEquipment3Sub3Name(String equipment3Sub3Name) {
     this.equipment3Sub3Name = equipment3Sub3Name;
 }

 public double getEquipment3Sub3Value() {
     return equipment3Sub3Value;
 }

 public void setEquipment3Sub3Value(double equipment3Sub3Value) {
     this.equipment3Sub3Value = equipment3Sub3Value;
 }
 public Integer getFighterLevel() {
	    return fighterLevel;
	}

	public void setFighterLevel(Integer fighterLevel) {
	    this.fighterLevel = fighterLevel;
	}
	public Integer getSupporter1Level() {
	    return supporter1Level;
	}

	public void setSupporter1Level(Integer supporter1Level) {
	    this.supporter1Level = supporter1Level;
	}

	public Integer getSupporter2Level() {
	    return supporter2Level;
	}

	public void setSupporter2Level(Integer supporter2Level) {
	    this.supporter2Level = supporter2Level;
	}

	public Integer getSupporter3Level() {
	    return supporter3Level;
	}

	public void setSupporter3Level(Integer supporter3Level) {
	    this.supporter3Level = supporter3Level;
	}

	public Integer getSupporter4Level() {
	    return supporter4Level;
	}

	public void setSupporter4Level(Integer supporter4Level) {
	    this.supporter4Level = supporter4Level;
	}

	public Integer getSupporter5Level() {
	    return supporter5Level;
	}

	public void setSupporter5Level(Integer supporter5Level) {
	    this.supporter5Level = supporter5Level;
	}

	public Integer getSceneCard1Level() {
	    return sceneCard1Level;
	}

	public void setSceneCard1Level(Integer sceneCard1Level) {
	    this.sceneCard1Level = sceneCard1Level;
	}


	public Integer getSceneCard2Level() {
	    return sceneCard2Level;
	}

	public void setSceneCard2Level(Integer sceneCard2Level) {
	    this.sceneCard2Level = sceneCard2Level;
	}


	public Integer getSceneCard3Level() {
	    return sceneCard3Level;
	}

	public void setSceneCard3Level(Integer sceneCard3Level) {
	    this.sceneCard3Level = sceneCard3Level;
	}
	public String getComment() {
	    return comment;
	}

	public void setComment(String comment) {
	    this.comment = comment;
	}
}