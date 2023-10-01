package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I38Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i43Provider;
    @Hard
    private final Provider<Integer> i45Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i51Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b8Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b12Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b14Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b22Provider.get(request);
		int p11Val = b25Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b32Provider.get(request);
		int p14Val = b34Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b41Provider.get(request);
		int p17Val = b43Provider.get(request);
		int p18Val = b44Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = b45Provider.get(request);
		int p20Val = b47Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i42Provider.get(request);
		int p23Val = i43Provider.get(request);
		int p24Val = i45Provider.get(request);
		int p25Val = i46Provider.get(request);
		int p26Val = i47Provider.get(request);
		int p27Val = i51Provider.get(request);
		int p28Val = i53Provider.get(request);
		int p29Val = i55Provider.get(request);
		int p30Val = i59Provider.get(request);
		int p31Val = i62Provider.get(request);
		int p32Val = i64Provider.get(request);
		int p33Val = i66Provider.get(request);
		int p34Val = i68Provider.get(request);
		int p35Val = i70Provider.get(request);
		int p36Val = i72Provider.get(request);
		int p37Val = i73Provider.get(request);
		int p38Val = i74Provider.get(request);
		int p39Val = i76Provider.get(request);
		int p40Val = i77Provider.get(request);
		int p41Val = i78Provider.get(request);
		int p42Val = i79Provider.get(request);
		int p43Val = i85Provider.get(request);
		int p44Val = i86Provider.get(request);
		int p45Val = i88Provider.get(request);
		int p46Val = i89Provider.get(request);
		int p47Val = i90Provider.get(request);
		int p48Val = i91Provider.get(request);
		int p49Val = i92Provider.get(request);
		int p50Val = i94Provider.get(request);
		int p51Val = i95Provider.get(request);
		int p52Val = i99Provider.get(request);
		int p53Val = i100Provider.get(request);
		int p54Val = i102Provider.get(request);
		int p55Val = i105Provider.get(request);
		
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p56Val = i107Provider.get(request);
		int p57Val = i111Provider.get(request);
		int p58Val = i113Provider.get(request);
		int p59Val = i115Provider.get(request);
		int p60Val = i118Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p61Val = i119Provider.get(request);
		int p62Val = i120Provider.get(request);
		int p63Val = i126Provider.get(request);
		int p64Val = i130Provider.get(request);
		int p65Val = i134Provider.get(request);
		int p66Val = i137Provider.get(request);
		int p67Val = i142Provider.get(request);
		int p68Val = i144Provider.get(request);
		int p69Val = i145Provider.get(request);
		int p70Val = i147Provider.get(request);
		int p71Val = i148Provider.get(request);
		int p72Val = i151Provider.get(request);
		int p73Val = i154Provider.get(request);
		int p74Val = i158Provider.get(request);
		int p75Val = i159Provider.get(request);
		int p76Val = i168Provider.get(request);
		int p77Val = i169Provider.get(request);
		int p78Val = i172Provider.get(request);
		int p79Val = i173Provider.get(request);
		int p80Val = i175Provider.get(request);
		int p81Val = i176Provider.get(request);
		int p82Val = i179Provider.get(request);
		int p83Val = i181Provider.get(request);
		int p84Val = i185Provider.get(request);
		int p85Val = i188Provider.get(request);
		int p86Val = i189Provider.get(request);
		int p87Val = i196Provider.get(request);
		int p88Val = i198Provider.get(request);
		int p89Val = i199Provider.get(request);
		int p90Val = i200Provider.get(request);

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
				p90Val;
    }
}
