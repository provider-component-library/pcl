package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I30Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i33Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i45Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i51Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i57Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b9Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b18Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b23Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b24Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b35Provider.get(request);
		int p13Val = b41Provider.get(request);
		int p14Val = b45Provider.get(request);
		int p15Val = b47Provider.get(request);
		int p16Val = i33Provider.get(request);
		int p17Val = i34Provider.get(request);
		int p18Val = i35Provider.get(request);
		int p19Val = i39Provider.get(request);
		int p20Val = i41Provider.get(request);
		int p21Val = i45Provider.get(request);
		int p22Val = i46Provider.get(request);
		int p23Val = i49Provider.get(request);
		int p24Val = i50Provider.get(request);
		int p25Val = i51Provider.get(request);
		int p26Val = i52Provider.get(request);
		int p27Val = i53Provider.get(request);
		int p28Val = i54Provider.get(request);
		int p29Val = i56Provider.get(request);
		int p30Val = i57Provider.get(request);
		int p31Val = i58Provider.get(request);
		int p32Val = i60Provider.get(request);
		int p33Val = i65Provider.get(request);
		int p34Val = i67Provider.get(request);
		int p35Val = i68Provider.get(request);
		int p36Val = i69Provider.get(request);
		int p37Val = i70Provider.get(request);
		int p38Val = i72Provider.get(request);
		int p39Val = i74Provider.get(request);
		int p40Val = i75Provider.get(request);
		int p41Val = i76Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p42Val = i78Provider.get(request);
		int p43Val = i79Provider.get(request);
		int p44Val = i82Provider.get(request);
		int p45Val = i84Provider.get(request);
		int p46Val = i86Provider.get(request);
		int p47Val = i87Provider.get(request);
		int p48Val = i89Provider.get(request);
		int p49Val = i91Provider.get(request);
		int p50Val = i92Provider.get(request);
		int p51Val = i93Provider.get(request);
		int p52Val = i100Provider.get(request);
		int p53Val = i101Provider.get(request);
		int p54Val = i102Provider.get(request);
		int p55Val = i103Provider.get(request);
		int p56Val = i111Provider.get(request);
		int p57Val = i112Provider.get(request);
		int p58Val = i114Provider.get(request);
		int p59Val = i115Provider.get(request);
		int p60Val = i121Provider.get(request);
		int p61Val = i126Provider.get(request);
		int p62Val = i128Provider.get(request);
		int p63Val = i129Provider.get(request);
		int p64Val = i130Provider.get(request);
		int p65Val = i133Provider.get(request);
		int p66Val = i135Provider.get(request);
		int p67Val = i136Provider.get(request);
		int p68Val = i138Provider.get(request);
		int p69Val = i140Provider.get(request);
		int p70Val = i143Provider.get(request);
		int p71Val = i146Provider.get(request);
		int p72Val = i147Provider.get(request);
		int p73Val = i149Provider.get(request);
		int p74Val = i152Provider.get(request);
		int p75Val = i158Provider.get(request);
		int p76Val = i159Provider.get(request);
		int p77Val = i160Provider.get(request);
		int p78Val = i161Provider.get(request);
		
        try {
            Thread.sleep(63);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p79Val = i162Provider.get(request);
		int p80Val = i163Provider.get(request);
		int p81Val = i167Provider.get(request);
		int p82Val = i174Provider.get(request);
		int p83Val = i177Provider.get(request);
		int p84Val = i184Provider.get(request);
		int p85Val = i185Provider.get(request);
		int p86Val = i187Provider.get(request);
		int p87Val = i190Provider.get(request);
		int p88Val = i192Provider.get(request);
		int p89Val = i195Provider.get(request);
		int p90Val = i196Provider.get(request);
		int p91Val = i197Provider.get(request);

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
				p91Val;
    }
}
