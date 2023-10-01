package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I7Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i13Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i20Provider;
    @Hard
    private final Provider<Integer> i21Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i32Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i56Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i83Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b21Provider.get(request);
		int p7Val = b23Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b26Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b31Provider.get(request);
		int p11Val = b33Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b39Provider.get(request);
		int p14Val = b45Provider.get(request);
		int p15Val = b47Provider.get(request);
		int p16Val = b49Provider.get(request);
		int p17Val = i13Provider.get(request);
		int p18Val = i16Provider.get(request);
		int p19Val = i18Provider.get(request);
		int p20Val = i20Provider.get(request);
		int p21Val = i21Provider.get(request);
		int p22Val = i31Provider.get(request);
		int p23Val = i32Provider.get(request);
		int p24Val = i35Provider.get(request);
		int p25Val = i47Provider.get(request);
		int p26Val = i54Provider.get(request);
		int p27Val = i56Provider.get(request);
		int p28Val = i59Provider.get(request);
		int p29Val = i60Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p30Val = i61Provider.get(request);
		int p31Val = i65Provider.get(request);
		int p32Val = i68Provider.get(request);
		int p33Val = i70Provider.get(request);
		int p34Val = i71Provider.get(request);
		int p35Val = i73Provider.get(request);
		int p36Val = i79Provider.get(request);
		int p37Val = i80Provider.get(request);
		int p38Val = i82Provider.get(request);
		int p39Val = i83Provider.get(request);
		int p40Val = i84Provider.get(request);
		int p41Val = i91Provider.get(request);
		int p42Val = i93Provider.get(request);
		int p43Val = i99Provider.get(request);
		int p44Val = i100Provider.get(request);
		int p45Val = i103Provider.get(request);
		int p46Val = i104Provider.get(request);
		int p47Val = i107Provider.get(request);
		
        try {
            Thread.sleep(54);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p48Val = i109Provider.get(request);
		int p49Val = i112Provider.get(request);
		int p50Val = i113Provider.get(request);
		int p51Val = i119Provider.get(request);
		int p52Val = i120Provider.get(request);
		int p53Val = i128Provider.get(request);
		int p54Val = i132Provider.get(request);
		int p55Val = i136Provider.get(request);
		int p56Val = i141Provider.get(request);
		int p57Val = i148Provider.get(request);
		int p58Val = i152Provider.get(request);
		int p59Val = i155Provider.get(request);
		int p60Val = i156Provider.get(request);
		int p61Val = i159Provider.get(request);
		int p62Val = i161Provider.get(request);
		int p63Val = i165Provider.get(request);
		int p64Val = i166Provider.get(request);
		int p65Val = i169Provider.get(request);
		int p66Val = i175Provider.get(request);
		int p67Val = i176Provider.get(request);
		int p68Val = i179Provider.get(request);
		int p69Val = i181Provider.get(request);
		int p70Val = i182Provider.get(request);
		int p71Val = i184Provider.get(request);
		int p72Val = i185Provider.get(request);
		int p73Val = i186Provider.get(request);
		int p74Val = i194Provider.get(request);
		int p75Val = i198Provider.get(request);
		int p76Val = i200Provider.get(request);

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
				p76Val;
    }
}
