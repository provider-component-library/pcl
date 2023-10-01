package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I61Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i69Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
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
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b12Provider.get(request);
		int p3Val = b13Provider.get(request);
		int p4Val = b18Provider.get(request);
		int p5Val = b23Provider.get(request);
		int p6Val = b24Provider.get(request);
		int p7Val = b25Provider.get(request);
		int p8Val = b26Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b32Provider.get(request);
		int p11Val = b35Provider.get(request);
		int p12Val = b38Provider.get(request);
		int p13Val = b39Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b44Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = b49Provider.get(request);
		int p19Val = i65Provider.get(request);
		int p20Val = i68Provider.get(request);
		int p21Val = i69Provider.get(request);
		int p22Val = i70Provider.get(request);
		int p23Val = i71Provider.get(request);
		int p24Val = i73Provider.get(request);
		int p25Val = i75Provider.get(request);
		int p26Val = i76Provider.get(request);
		int p27Val = i77Provider.get(request);
		int p28Val = i79Provider.get(request);
		int p29Val = i82Provider.get(request);
		int p30Val = i84Provider.get(request);
		int p31Val = i85Provider.get(request);
		int p32Val = i87Provider.get(request);
		int p33Val = i89Provider.get(request);
		int p34Val = i90Provider.get(request);
		int p35Val = i93Provider.get(request);
		int p36Val = i95Provider.get(request);
		int p37Val = i104Provider.get(request);
		int p38Val = i105Provider.get(request);
		int p39Val = i106Provider.get(request);
		int p40Val = i108Provider.get(request);
		int p41Val = i109Provider.get(request);
		int p42Val = i113Provider.get(request);
		int p43Val = i115Provider.get(request);
		int p44Val = i117Provider.get(request);
		int p45Val = i119Provider.get(request);
		int p46Val = i123Provider.get(request);
		int p47Val = i126Provider.get(request);
		int p48Val = i128Provider.get(request);
		int p49Val = i130Provider.get(request);
		int p50Val = i133Provider.get(request);
		int p51Val = i137Provider.get(request);
		int p52Val = i138Provider.get(request);
		int p53Val = i140Provider.get(request);
		int p54Val = i142Provider.get(request);
		int p55Val = i145Provider.get(request);
		
        try {
            Thread.sleep(39);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p56Val = i146Provider.get(request);
		int p57Val = i147Provider.get(request);
		int p58Val = i150Provider.get(request);
		int p59Val = i151Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p60Val = i152Provider.get(request);
		int p61Val = i156Provider.get(request);
		int p62Val = i158Provider.get(request);
		int p63Val = i160Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p64Val = i161Provider.get(request);
		int p65Val = i165Provider.get(request);
		int p66Val = i169Provider.get(request);
		int p67Val = i172Provider.get(request);
		int p68Val = i173Provider.get(request);
		int p69Val = i174Provider.get(request);
		int p70Val = i175Provider.get(request);
		int p71Val = i178Provider.get(request);
		int p72Val = i179Provider.get(request);
		int p73Val = i180Provider.get(request);
		int p74Val = i183Provider.get(request);
		int p75Val = i187Provider.get(request);
		int p76Val = i189Provider.get(request);
		int p77Val = i190Provider.get(request);
		int p78Val = i191Provider.get(request);
		int p79Val = i197Provider.get(request);
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
