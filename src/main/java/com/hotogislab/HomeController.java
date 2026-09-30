package com.hotogislab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final TrainingRecordRepository repository;

    public HomeController(
            TrainingRecordRepository repository) {

        this.repository = repository;
    }


    @GetMapping("/")
    public String home(
            org.springframework.ui.Model model) {

        model.addAttribute(
                "fighters",
                java.util.List.of(
                        "(新) 範馬 勇次郎",
                        "範馬 勇次郎", 
                        "宮本 武蔵",
                        "(新)範馬 刃牙",
                        "UR範馬 刃牙",
                        "範馬 刃牙",
                        "範馬 勇一郎",
                        "ジャック・ハンマー",
                        "URジャック・ハンマー",
                        "(新)愚地 独歩",
                        "愚地 独歩",
                        "(新)渋川 剛気",
                        "渋川 剛気",
                        "(新)烈 海王",
                        "烈 海王",
                        "(新)花山 薫",
                        "花山 薫",
                        "(新)愚地 克己",
                        "愚地 克己",
                        "柴 千春",
                        "ガイア",
                        "(新)本部 以蔵",
                        "本部 以蔵",
                        "アライJr",
                        "オリバ",
                        "ピクル",
                        "ゲバル",
                        "郭 海王"
                        
                        
                       
                )
        );
        
        model.addAttribute(
                "supporters",
                java.util.List.of(
                		 "(新) 範馬 勇次郎",
                         "範馬 勇次郎", 
                         "宮本 武蔵",
                         "(新)範馬 刃牙",
                         "UR範馬 刃牙",
                         "範馬 刃牙",
                         "範馬 勇一郎",
                         "ジャック・ハンマー",
                         "URジャック・ハンマー",
                         "(新)愚地 独歩",
                         "愚地 独歩",
                         "(新)渋川 剛気",
                         "渋川 剛気",
                         "(新)烈 海王",
                         "烈 海王",
                         "(新)花山 薫",
                         "花山 薫",
                         "(新)愚地 克己",
                         "愚地 克己",
                         "柴 千春",
                         "ガイア",
                         "(新)本部 以蔵",
                         "本部 以蔵",
                         "アライJr",
                         "オリバ",
                         "ピクル",
                         "ゲバル",
                         "郭 海王"
                         
                )
        );

        model.addAttribute(
                "sceneCards",
                java.util.List.of(
                        "地下闘技場闘士",
                        "最凶死刑囚",
                        "侠客立ち",
                        "強くなりたくば喰らえ!!!!",
                        "虎殺し",
                        "歴戦の風格",
                        "わたしは一向にかまわんッッ",
                        "白黒つけようや",
                        "強者への執念",
                        "臆病者",
                        "逃げよ",
                        "強さとは力",
                        "偉大な支え",
                        "死に勝る護身なし",
                        "グルグルパンチ",
                        "天下無敵の大怪物",
                        "神心会の正月",
                        "尖りすぎ",
                        "この女性をこうするために",
                        "ね♡だからボクと遊ぼう♡",
                        "だから感謝というのだろう",
                        "強さ比較べ",
                        "悪魔的な闘気",
                        "力の頂上",
                        "奇襲の頭突き",
                        "えらいこと",
                        "必ずお前は守護る",
                        "遠慮なく……",
                        "お母ちゃん……",
                        "UR 欠伸かましてやる!!!",
                        "UR 真夏の安らぎ"
                        
                )
        );
        
        model.addAttribute(
                "equipments",
                java.util.List.of(
                        "テーピング",
                        "ボクシンググローブ",
                        "カンフーシューズ",
                        "多節棍",
                        "日本刀",
                        "黒帯",
                        "眼帯",
                        "ステロイド",
                        "お守り",
                        "勇気の瓶"
                )
        );
        
        model.addAttribute(
                "subAbilities",
                java.util.List.of(
                        "極意継承発生率",
                        "戦闘ボーナス",
                        "究極鍛錬率",

                        "常時筋力獲得量上昇",
                        "常時体力獲得量上昇",
                        "常時タフネス獲得量上昇",
                        "常時技術獲得量上昇",
                        "常時俊敏性獲得量上昇",
                        "常時精神力獲得量上昇",

                        "【筋トレ】究極鍛錬率上昇",
                        "【ディフェンス】究極鍛錬率上昇",
                        "【シャドー】究極鍛錬率上昇",
                        "【ラン】究極鍛錬率上昇",
                        "【イメージ】究極鍛錬率上昇",

                        "【筋トレ】エクストラボーナス1段階",
                        "【筋トレ】エクストラボーナス2段階",
                        
                        "【ディフェンス】エクストラボーナス1段階",
                        "【ディフェンス】エクストラボーナス2段階",
                        
                        "【シャドー】エクストラボーナス1段階",
                        "【シャドー】エクストラボーナス2段階",
                        
                        "【ラン】エクストラボーナス1段階",
                        "【ラン】エクストラボーナス2段階",

                        "【イメージ】エクストラボーナス1段階",
                        "【イメージ】エクストラボーナス2段階",

                        "【筋トレ】闘気覚醒発生率上昇",
                        "【ディフェンス】闘気覚醒発生率上昇",
                        "【シャドー】闘気覚醒発生率上昇",
                        "【ラン】闘気覚醒発生率上昇",
                        "【イメージ】闘気覚醒発生率上昇",

                        "筋力固定ボーナス",
                        "体力固定ボーナス",
                        "タフネス固定ボーナス",
                        "技術固定ボーナス",
                        "俊敏性固定ボーナス",
                        "精神力固定ボーナス",

                        "極技 テーピング",
                        "極技 ボクシンググローブ",
                        "極技 カンフーシューズ",
                        "極技 多節棍",
                        "極技 日本刀",
                        "極技 黒帯",
                        "極技 眼帯",
                        "極技 ステロイド",
                        "極技 お守り",
                        "極技 勇気の瓶"
                )
        );
        
        return "index";
    }

    @PostMapping("/training-records")
    public String saveTrainingRecord(
            TrainingRecord record,
            org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {

        repository.save(record);

        redirectAttributes.addFlashAttribute(
                "successMessage",
                "育成データを登録しました！"
        );

        return "redirect:/";
    }
    @GetMapping("/records")
    public String records(
            org.springframework.ui.Model model) {

        model.addAttribute(
                "records",
                repository.findAll()
        );

        return "records";
    }
}