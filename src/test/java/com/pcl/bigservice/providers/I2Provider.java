package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I2Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> i5Provider;
    @Hard
    private final Provider<Integer> i6Provider;
    @Hard
    private final Provider<Integer> i7Provider;
    @Hard
    private final Provider<Integer> i8Provider;
    @Hard
    private final Provider<Integer> i9Provider;
    @Hard
    private final Provider<Integer> i12Provider;
    @Hard
    private final Provider<Integer> i13Provider;
    @Hard
    private final Provider<Integer> i14Provider;
    @Hard
    private final Provider<Integer> i15Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i17Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i19Provider;
    @Hard
    private final Provider<Integer> i20Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i40Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i43Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i45Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i48Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b32Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b36Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b39Provider.get(request);
		int p17Val = b40Provider.get(request);
		int p18Val = b41Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = i5Provider.get(request);
		int p21Val = i6Provider.get(request);
		int p22Val = i7Provider.get(request);
		int p23Val = i8Provider.get(request);
		
        try {
            Thread.sleep(56);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p24Val = i9Provider.get(request);
		int p25Val = i12Provider.get(request);
		int p26Val = i13Provider.get(request);
		int p27Val = i14Provider.get(request);
		int p28Val = i15Provider.get(request);
		int p29Val = i16Provider.get(request);
		int p30Val = i17Provider.get(request);
		int p31Val = i18Provider.get(request);
		int p32Val = i19Provider.get(request);
		int p33Val = i20Provider.get(request);
		
        try {
            Thread.sleep(84);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i27Provider.get(request);
		int p35Val = i35Provider.get(request);
		int p36Val = i37Provider.get(request);
		int p37Val = i40Provider.get(request);
		int p38Val = i41Provider.get(request);
		int p39Val = i42Provider.get(request);
		int p40Val = i43Provider.get(request);
		int p41Val = i44Provider.get(request);
		int p42Val = i45Provider.get(request);
		int p43Val = i46Provider.get(request);
		int p44Val = i48Provider.get(request);
		int p45Val = i58Provider.get(request);
		int p46Val = i59Provider.get(request);
		int p47Val = i61Provider.get(request);
		int p48Val = i63Provider.get(request);
		int p49Val = i64Provider.get(request);
		int p50Val = i65Provider.get(request);
		int p51Val = i72Provider.get(request);
		int p52Val = i73Provider.get(request);
		int p53Val = i74Provider.get(request);
		int p54Val = i75Provider.get(request);
		int p55Val = i76Provider.get(request);
		int p56Val = i77Provider.get(request);
		int p57Val = i78Provider.get(request);
		int p58Val = i79Provider.get(request);
		int p59Val = i82Provider.get(request);
		int p60Val = i84Provider.get(request);
		int p61Val = i87Provider.get(request);
		int p62Val = i88Provider.get(request);
		int p63Val = i90Provider.get(request);
		int p64Val = i91Provider.get(request);
		int p65Val = i92Provider.get(request);
		int p66Val = i93Provider.get(request);
		int p67Val = i95Provider.get(request);
		int p68Val = i96Provider.get(request);
		int p69Val = i104Provider.get(request);
		int p70Val = i105Provider.get(request);
		int p71Val = i108Provider.get(request);
		int p72Val = i109Provider.get(request);
		int p73Val = i111Provider.get(request);
		int p74Val = i112Provider.get(request);
		int p75Val = i114Provider.get(request);
		int p76Val = i116Provider.get(request);
		int p77Val = i117Provider.get(request);
		int p78Val = i118Provider.get(request);
		int p79Val = i119Provider.get(request);
		int p80Val = i120Provider.get(request);
		int p81Val = i123Provider.get(request);
		int p82Val = i125Provider.get(request);
		int p83Val = i129Provider.get(request);
		int p84Val = i132Provider.get(request);
		int p85Val = i134Provider.get(request);
		int p86Val = i138Provider.get(request);
		int p87Val = i140Provider.get(request);
		int p88Val = i141Provider.get(request);
		int p89Val = i144Provider.get(request);
		int p90Val = i147Provider.get(request);
		int p91Val = i149Provider.get(request);
		int p92Val = i152Provider.get(request);
		int p93Val = i155Provider.get(request);
		int p94Val = i157Provider.get(request);
		int p95Val = i158Provider.get(request);
		int p96Val = i160Provider.get(request);
		int p97Val = i161Provider.get(request);
		int p98Val = i168Provider.get(request);
		int p99Val = i170Provider.get(request);
		int p100Val = i174Provider.get(request);
		int p101Val = i175Provider.get(request);
		int p102Val = i178Provider.get(request);
		int p103Val = i179Provider.get(request);
		int p104Val = i180Provider.get(request);
		int p105Val = i181Provider.get(request);
		int p106Val = i183Provider.get(request);
		int p107Val = i184Provider.get(request);
		int p108Val = i187Provider.get(request);
		int p109Val = i188Provider.get(request);
		
        try {
            Thread.sleep(73);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p110Val = i196Provider.get(request);
		int p111Val = i197Provider.get(request);
		int p112Val = i199Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val +
				p83Val +
				p84Val +
				p85Val +
				p86Val +
				p87Val +
				p88Val +
				p89Val +
				p90Val +
				p91Val +
				p92Val +
				p93Val +
				p94Val +
				p95Val +
				p96Val +
				p97Val +
				p98Val +
				p99Val +
				p100Val +
				p101Val +
				p102Val +
				p103Val +
				p104Val +
				p105Val +
				p106Val +
				p107Val +
				p108Val +
				p109Val +
				p110Val +
				p111Val +
				p112Val;
    }
}
