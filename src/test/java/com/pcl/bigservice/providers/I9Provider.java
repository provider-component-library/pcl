package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I9Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> i17Provider;
    @Hard
    private final Provider<Integer> i19Provider;
    @Hard
    private final Provider<Integer> i20Provider;
    @Hard
    private final Provider<Integer> i23Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i39Provider;
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
    private final Provider<Integer> i48Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i53Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b6Provider.get(request);
		int p4Val = b8Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b24Provider.get(request);
		int p11Val = b25Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b35Provider.get(request);
		
        try {
            Thread.sleep(45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b38Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = i17Provider.get(request);
		int p17Val = i19Provider.get(request);
		int p18Val = i20Provider.get(request);
		int p19Val = i23Provider.get(request);
		int p20Val = i27Provider.get(request);
		int p21Val = i31Provider.get(request);
		int p22Val = i36Provider.get(request);
		int p23Val = i37Provider.get(request);
		int p24Val = i38Provider.get(request);
		int p25Val = i39Provider.get(request);
		int p26Val = i41Provider.get(request);
		int p27Val = i42Provider.get(request);
		int p28Val = i43Provider.get(request);
		int p29Val = i44Provider.get(request);
		int p30Val = i45Provider.get(request);
		int p31Val = i48Provider.get(request);
		int p32Val = i52Provider.get(request);
		int p33Val = i53Provider.get(request);
		int p34Val = i58Provider.get(request);
		int p35Val = i60Provider.get(request);
		int p36Val = i65Provider.get(request);
		int p37Val = i67Provider.get(request);
		int p38Val = i75Provider.get(request);
		int p39Val = i77Provider.get(request);
		int p40Val = i78Provider.get(request);
		int p41Val = i79Provider.get(request);
		int p42Val = i85Provider.get(request);
		int p43Val = i87Provider.get(request);
		int p44Val = i89Provider.get(request);
		int p45Val = i93Provider.get(request);
		int p46Val = i95Provider.get(request);
		int p47Val = i96Provider.get(request);
		int p48Val = i101Provider.get(request);
		int p49Val = i102Provider.get(request);
		int p50Val = i104Provider.get(request);
		int p51Val = i105Provider.get(request);
		int p52Val = i106Provider.get(request);
		int p53Val = i107Provider.get(request);
		int p54Val = i108Provider.get(request);
		int p55Val = i109Provider.get(request);
		int p56Val = i111Provider.get(request);
		int p57Val = i113Provider.get(request);
		int p58Val = i116Provider.get(request);
		int p59Val = i119Provider.get(request);
		int p60Val = i122Provider.get(request);
		int p61Val = i123Provider.get(request);
		int p62Val = i126Provider.get(request);
		int p63Val = i128Provider.get(request);
		int p64Val = i131Provider.get(request);
		int p65Val = i132Provider.get(request);
		int p66Val = i140Provider.get(request);
		int p67Val = i141Provider.get(request);
		int p68Val = i142Provider.get(request);
		int p69Val = i144Provider.get(request);
		int p70Val = i147Provider.get(request);
		int p71Val = i151Provider.get(request);
		int p72Val = i153Provider.get(request);
		int p73Val = i155Provider.get(request);
		int p74Val = i164Provider.get(request);
		int p75Val = i170Provider.get(request);
		int p76Val = i171Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p77Val = i175Provider.get(request);
		int p78Val = i179Provider.get(request);
		int p79Val = i181Provider.get(request);
		int p80Val = i183Provider.get(request);
		int p81Val = i188Provider.get(request);
		int p82Val = i190Provider.get(request);
		int p83Val = i191Provider.get(request);
		int p84Val = i192Provider.get(request);
		int p85Val = i195Provider.get(request);
		int p86Val = i197Provider.get(request);

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
				p86Val;
    }
}
