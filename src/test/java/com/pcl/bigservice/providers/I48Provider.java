package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I48Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i157Provider;
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
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b3Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b6Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b9Provider.get(request);
		int p8Val = b11Provider.get(request);
		int p9Val = b14Provider.get(request);
		int p10Val = b15Provider.get(request);
		int p11Val = b16Provider.get(request);
		int p12Val = b22Provider.get(request);
		int p13Val = b23Provider.get(request);
		int p14Val = b25Provider.get(request);
		int p15Val = b27Provider.get(request);
		int p16Val = b28Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b36Provider.get(request);
		
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = b41Provider.get(request);
		int p20Val = b42Provider.get(request);
		int p21Val = b45Provider.get(request);
		int p22Val = b46Provider.get(request);
		int p23Val = b47Provider.get(request);
		int p24Val = b49Provider.get(request);
		int p25Val = i54Provider.get(request);
		int p26Val = i55Provider.get(request);
		int p27Val = i59Provider.get(request);
		int p28Val = i61Provider.get(request);
		int p29Val = i62Provider.get(request);
		int p30Val = i63Provider.get(request);
		int p31Val = i65Provider.get(request);
		int p32Val = i66Provider.get(request);
		int p33Val = i72Provider.get(request);
		int p34Val = i75Provider.get(request);
		int p35Val = i78Provider.get(request);
		int p36Val = i80Provider.get(request);
		int p37Val = i88Provider.get(request);
		int p38Val = i90Provider.get(request);
		int p39Val = i93Provider.get(request);
		int p40Val = i94Provider.get(request);
		int p41Val = i98Provider.get(request);
		int p42Val = i99Provider.get(request);
		int p43Val = i100Provider.get(request);
		int p44Val = i102Provider.get(request);
		int p45Val = i109Provider.get(request);
		int p46Val = i112Provider.get(request);
		int p47Val = i115Provider.get(request);
		int p48Val = i117Provider.get(request);
		int p49Val = i123Provider.get(request);
		int p50Val = i126Provider.get(request);
		int p51Val = i128Provider.get(request);
		int p52Val = i129Provider.get(request);
		int p53Val = i130Provider.get(request);
		int p54Val = i134Provider.get(request);
		int p55Val = i145Provider.get(request);
		int p56Val = i147Provider.get(request);
		int p57Val = i152Provider.get(request);
		int p58Val = i157Provider.get(request);
		int p59Val = i159Provider.get(request);
		int p60Val = i160Provider.get(request);
		int p61Val = i161Provider.get(request);
		int p62Val = i162Provider.get(request);
		int p63Val = i163Provider.get(request);
		int p64Val = i164Provider.get(request);
		int p65Val = i166Provider.get(request);
		int p66Val = i167Provider.get(request);
		int p67Val = i169Provider.get(request);
		int p68Val = i170Provider.get(request);
		int p69Val = i178Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p70Val = i179Provider.get(request);
		int p71Val = i181Provider.get(request);
		int p72Val = i182Provider.get(request);
		int p73Val = i184Provider.get(request);
		int p74Val = i186Provider.get(request);
		int p75Val = i189Provider.get(request);
		int p76Val = i190Provider.get(request);
		int p77Val = i194Provider.get(request);
		int p78Val = i195Provider.get(request);
		int p79Val = i196Provider.get(request);
		int p80Val = i199Provider.get(request);
		int p81Val = i200Provider.get(request);

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
				p81Val;
    }
}
