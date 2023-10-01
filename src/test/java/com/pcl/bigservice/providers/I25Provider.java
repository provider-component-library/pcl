package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I25Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b35Provider;
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
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i32Provider;
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
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i55Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i83Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i187Provider;
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
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b8Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b24Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b26Provider.get(request);
		int p12Val = b27Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b35Provider.get(request);
		int p15Val = b36Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b38Provider.get(request);
		int p18Val = b39Provider.get(request);
		int p19Val = b40Provider.get(request);
		int p20Val = b42Provider.get(request);
		int p21Val = b44Provider.get(request);
		int p22Val = b46Provider.get(request);
		int p23Val = b49Provider.get(request);
		int p24Val = b50Provider.get(request);
		int p25Val = i26Provider.get(request);
		int p26Val = i32Provider.get(request);
		int p27Val = i37Provider.get(request);
		int p28Val = i40Provider.get(request);
		int p29Val = i41Provider.get(request);
		int p30Val = i42Provider.get(request);
		int p31Val = i43Provider.get(request);
		int p32Val = i46Provider.get(request);
		int p33Val = i49Provider.get(request);
		int p34Val = i50Provider.get(request);
		int p35Val = i55Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(58);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p36Val = i59Provider.get(request);
		int p37Val = i61Provider.get(request);
		int p38Val = i62Provider.get(request);
		int p39Val = i65Provider.get(request);
		int p40Val = i66Provider.get(request);
		int p41Val = i70Provider.get(request);
		int p42Val = i71Provider.get(request);
		int p43Val = i73Provider.get(request);
		int p44Val = i75Provider.get(request);
		int p45Val = i81Provider.get(request);
		int p46Val = i82Provider.get(request);
		int p47Val = i83Provider.get(request);
		int p48Val = i85Provider.get(request);
		int p49Val = i86Provider.get(request);
		int p50Val = i90Provider.get(request);
		int p51Val = i91Provider.get(request);
		int p52Val = i93Provider.get(request);
		int p53Val = i95Provider.get(request);
		int p54Val = i96Provider.get(request);
		int p55Val = i97Provider.get(request);
		int p56Val = i99Provider.get(request);
		int p57Val = i102Provider.get(request);
		int p58Val = i105Provider.get(request);
		int p59Val = i107Provider.get(request);
		int p60Val = i111Provider.get(request);
		int p61Val = i112Provider.get(request);
		int p62Val = i113Provider.get(request);
		int p63Val = i117Provider.get(request);
		int p64Val = i118Provider.get(request);
		int p65Val = i120Provider.get(request);
		int p66Val = i122Provider.get(request);
		int p67Val = i124Provider.get(request);
		int p68Val = i125Provider.get(request);
		int p69Val = i126Provider.get(request);
		int p70Val = i128Provider.get(request);
		int p71Val = i130Provider.get(request);
		int p72Val = i133Provider.get(request);
		int p73Val = i134Provider.get(request);
		int p74Val = i136Provider.get(request);
		int p75Val = i137Provider.get(request);
		int p76Val = i139Provider.get(request);
		int p77Val = i140Provider.get(request);
		int p78Val = i141Provider.get(request);
		int p79Val = i142Provider.get(request);
		int p80Val = i144Provider.get(request);
		int p81Val = i145Provider.get(request);
		int p82Val = i146Provider.get(request);
		int p83Val = i148Provider.get(request);
		int p84Val = i151Provider.get(request);
		int p85Val = i153Provider.get(request);
		int p86Val = i155Provider.get(request);
		int p87Val = i156Provider.get(request);
		int p88Val = i166Provider.get(request);
		int p89Val = i168Provider.get(request);
		int p90Val = i170Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p91Val = i172Provider.get(request);
		int p92Val = i173Provider.get(request);
		int p93Val = i174Provider.get(request);
		int p94Val = i175Provider.get(request);
		int p95Val = i177Provider.get(request);
		int p96Val = i182Provider.get(request);
		int p97Val = i183Provider.get(request);
		int p98Val = i184Provider.get(request);
		int p99Val = i187Provider.get(request);
		int p100Val = i188Provider.get(request);
		int p101Val = i190Provider.get(request);
		int p102Val = i191Provider.get(request);
		int p103Val = i192Provider.get(request);
		int p104Val = i195Provider.get(request);
		int p105Val = i199Provider.get(request);

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
				p105Val;
    }
}
