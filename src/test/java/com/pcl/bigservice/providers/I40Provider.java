package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I40Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i45Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i47Provider;
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
    private final Provider<Integer> i60Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i69Provider;
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
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b26Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b32Provider.get(request);
		int p13Val = b33Provider.get(request);
		int p14Val = b35Provider.get(request);
		
        try {
            Thread.sleep(44);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b37Provider.get(request);
		int p16Val = b42Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = i45Provider.get(request);
		int p19Val = i46Provider.get(request);
		int p20Val = i47Provider.get(request);
		int p21Val = i49Provider.get(request);
		int p22Val = i50Provider.get(request);
		int p23Val = i51Provider.get(request);
		int p24Val = i52Provider.get(request);
		int p25Val = i53Provider.get(request);
		int p26Val = i54Provider.get(request);
		int p27Val = i56Provider.get(request);
		int p28Val = i60Provider.get(request);
		int p29Val = i62Provider.get(request);
		int p30Val = i63Provider.get(request);
		int p31Val = i64Provider.get(request);
		int p32Val = i66Provider.get(request);
		int p33Val = i67Provider.get(request);
		int p34Val = i68Provider.get(request);
		int p35Val = i69Provider.get(request);
		int p36Val = i73Provider.get(request);
		int p37Val = i75Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i81Provider.get(request);
		int p39Val = i82Provider.get(request);
		int p40Val = i83Provider.get(request);
		int p41Val = i84Provider.get(request);
		int p42Val = i85Provider.get(request);
		int p43Val = i87Provider.get(request);
		int p44Val = i91Provider.get(request);
		int p45Val = i98Provider.get(request);
		int p46Val = i99Provider.get(request);
		int p47Val = i100Provider.get(request);
		int p48Val = i102Provider.get(request);
		int p49Val = i105Provider.get(request);
		int p50Val = i106Provider.get(request);
		int p51Val = i109Provider.get(request);
		int p52Val = i114Provider.get(request);
		int p53Val = i115Provider.get(request);
		int p54Val = i117Provider.get(request);
		int p55Val = i119Provider.get(request);
		int p56Val = i126Provider.get(request);
		int p57Val = i127Provider.get(request);
		int p58Val = i132Provider.get(request);
		int p59Val = i133Provider.get(request);
		int p60Val = i134Provider.get(request);
		int p61Val = i136Provider.get(request);
		int p62Val = i138Provider.get(request);
		int p63Val = i139Provider.get(request);
		int p64Val = i140Provider.get(request);
		int p65Val = i142Provider.get(request);
		int p66Val = i144Provider.get(request);
		int p67Val = i145Provider.get(request);
		int p68Val = i149Provider.get(request);
		int p69Val = i150Provider.get(request);
		int p70Val = i152Provider.get(request);
		int p71Val = i154Provider.get(request);
		int p72Val = i157Provider.get(request);
		int p73Val = i158Provider.get(request);
		int p74Val = i164Provider.get(request);
		int p75Val = i165Provider.get(request);
		int p76Val = i167Provider.get(request);
		int p77Val = i171Provider.get(request);
		int p78Val = i172Provider.get(request);
		int p79Val = i173Provider.get(request);
		int p80Val = i174Provider.get(request);
		int p81Val = i176Provider.get(request);
		int p82Val = i179Provider.get(request);
		int p83Val = i180Provider.get(request);
		int p84Val = i186Provider.get(request);
		int p85Val = i189Provider.get(request);
		int p86Val = i194Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p87Val = i195Provider.get(request);
		int p88Val = i196Provider.get(request);
		int p89Val = i197Provider.get(request);

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
				p89Val;
    }
}
