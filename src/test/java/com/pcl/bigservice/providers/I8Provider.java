package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I8Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i11Provider;
    @Hard
    private final Provider<Integer> i12Provider;
    @Hard
    private final Provider<Integer> i15Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i24Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i29Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i33Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i40Provider;
    @Hard
    private final Provider<Integer> i42Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i193Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b12Provider.get(request);
		int p8Val = b15Provider.get(request);
		int p9Val = b16Provider.get(request);
		int p10Val = b17Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b25Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b29Provider.get(request);
		
        try {
            Thread.sleep(53);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b34Provider.get(request);
		int p17Val = b36Provider.get(request);
		int p18Val = b37Provider.get(request);
		int p19Val = b38Provider.get(request);
		int p20Val = b44Provider.get(request);
		int p21Val = b46Provider.get(request);
		int p22Val = b47Provider.get(request);
		int p23Val = b48Provider.get(request);
		int p24Val = i11Provider.get(request);
		int p25Val = i12Provider.get(request);
		int p26Val = i15Provider.get(request);
		int p27Val = i18Provider.get(request);
		int p28Val = i24Provider.get(request);
		int p29Val = i26Provider.get(request);
		int p30Val = i29Provider.get(request);
		int p31Val = i31Provider.get(request);
		int p32Val = i33Provider.get(request);
		int p33Val = i36Provider.get(request);
		int p34Val = i37Provider.get(request);
		int p35Val = i39Provider.get(request);
		int p36Val = i40Provider.get(request);
		int p37Val = i42Provider.get(request);
		int p38Val = i50Provider.get(request);
		int p39Val = i52Provider.get(request);
		int p40Val = i54Provider.get(request);
		int p41Val = i55Provider.get(request);
		int p42Val = i63Provider.get(request);
		int p43Val = i67Provider.get(request);
		int p44Val = i70Provider.get(request);
		int p45Val = i76Provider.get(request);
		int p46Val = i78Provider.get(request);
		int p47Val = i84Provider.get(request);
		
        try {
            Thread.sleep(48);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i86Provider.get(request);
		int p49Val = i90Provider.get(request);
		int p50Val = i91Provider.get(request);
		int p51Val = i100Provider.get(request);
		int p52Val = i101Provider.get(request);
		int p53Val = i104Provider.get(request);
		int p54Val = i105Provider.get(request);
		int p55Val = i107Provider.get(request);
		int p56Val = i108Provider.get(request);
		int p57Val = i109Provider.get(request);
		int p58Val = i113Provider.get(request);
		int p59Val = i117Provider.get(request);
		int p60Val = i118Provider.get(request);
		int p61Val = i121Provider.get(request);
		int p62Val = i123Provider.get(request);
		int p63Val = i128Provider.get(request);
		int p64Val = i138Provider.get(request);
		int p65Val = i140Provider.get(request);
		int p66Val = i141Provider.get(request);
		int p67Val = i146Provider.get(request);
		int p68Val = i150Provider.get(request);
		int p69Val = i151Provider.get(request);
		int p70Val = i152Provider.get(request);
		int p71Val = i154Provider.get(request);
		int p72Val = i156Provider.get(request);
		int p73Val = i157Provider.get(request);
		int p74Val = i161Provider.get(request);
		int p75Val = i162Provider.get(request);
		int p76Val = i164Provider.get(request);
		int p77Val = i165Provider.get(request);
		int p78Val = i173Provider.get(request);
		int p79Val = i175Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p80Val = i176Provider.get(request);
		int p81Val = i177Provider.get(request);
		int p82Val = i181Provider.get(request);
		int p83Val = i183Provider.get(request);
		int p84Val = i186Provider.get(request);
		int p85Val = i190Provider.get(request);
		int p86Val = i193Provider.get(request);

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
