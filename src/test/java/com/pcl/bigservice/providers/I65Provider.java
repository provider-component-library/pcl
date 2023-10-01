package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I65Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b8Provider.get(request);
		int p3Val = b10Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b27Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b32Provider.get(request);
		int p14Val = b35Provider.get(request);
		int p15Val = b36Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b46Provider.get(request);
		int p19Val = b47Provider.get(request);
		int p20Val = i73Provider.get(request);
		int p21Val = i75Provider.get(request);
		int p22Val = i76Provider.get(request);
		int p23Val = i77Provider.get(request);
		int p24Val = i78Provider.get(request);
		int p25Val = i81Provider.get(request);
		
        try {
            Thread.sleep(73);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i82Provider.get(request);
		int p27Val = i84Provider.get(request);
		int p28Val = i85Provider.get(request);
		int p29Val = i86Provider.get(request);
		
        try {
            Thread.sleep(82);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p30Val = i89Provider.get(request);
		int p31Val = i90Provider.get(request);
		int p32Val = i91Provider.get(request);
		int p33Val = i92Provider.get(request);
		int p34Val = i95Provider.get(request);
		int p35Val = i96Provider.get(request);
		int p36Val = i98Provider.get(request);
		int p37Val = i100Provider.get(request);
		int p38Val = i101Provider.get(request);
		int p39Val = i103Provider.get(request);
		int p40Val = i104Provider.get(request);
		int p41Val = i105Provider.get(request);
		int p42Val = i106Provider.get(request);
		int p43Val = i107Provider.get(request);
		int p44Val = i109Provider.get(request);
		int p45Val = i111Provider.get(request);
		int p46Val = i113Provider.get(request);
		int p47Val = i118Provider.get(request);
		
        try {
            Thread.sleep(64);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i120Provider.get(request);
		int p49Val = i121Provider.get(request);
		int p50Val = i125Provider.get(request);
		int p51Val = i126Provider.get(request);
		int p52Val = i128Provider.get(request);
		int p53Val = i129Provider.get(request);
		int p54Val = i130Provider.get(request);
		int p55Val = i136Provider.get(request);
		int p56Val = i139Provider.get(request);
		int p57Val = i141Provider.get(request);
		int p58Val = i142Provider.get(request);
		int p59Val = i143Provider.get(request);
		int p60Val = i148Provider.get(request);
		int p61Val = i149Provider.get(request);
		int p62Val = i150Provider.get(request);
		int p63Val = i151Provider.get(request);
		int p64Val = i157Provider.get(request);
		int p65Val = i161Provider.get(request);
		int p66Val = i164Provider.get(request);
		int p67Val = i166Provider.get(request);
		int p68Val = i167Provider.get(request);
		int p69Val = i168Provider.get(request);
		int p70Val = i170Provider.get(request);
		int p71Val = i172Provider.get(request);
		int p72Val = i173Provider.get(request);
		int p73Val = i177Provider.get(request);
		int p74Val = i179Provider.get(request);
		int p75Val = i181Provider.get(request);
		int p76Val = i182Provider.get(request);
		int p77Val = i183Provider.get(request);
		int p78Val = i186Provider.get(request);
		int p79Val = i187Provider.get(request);
		int p80Val = i188Provider.get(request);
		int p81Val = i190Provider.get(request);
		int p82Val = i196Provider.get(request);
		int p83Val = i199Provider.get(request);
		int p84Val = i200Provider.get(request);

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
				p84Val;
    }
}
