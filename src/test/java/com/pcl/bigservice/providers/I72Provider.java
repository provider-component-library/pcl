package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I72Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i83Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i129Provider;
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
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b13Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b22Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b32Provider.get(request);
		int p13Val = b34Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b42Provider.get(request);
		int p16Val = b43Provider.get(request);
		int p17Val = b44Provider.get(request);
		int p18Val = b45Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = i80Provider.get(request);
		int p22Val = i81Provider.get(request);
		int p23Val = i82Provider.get(request);
		int p24Val = i83Provider.get(request);
		int p25Val = i84Provider.get(request);
		int p26Val = i89Provider.get(request);
		int p27Val = i100Provider.get(request);
		int p28Val = i104Provider.get(request);
		int p29Val = i106Provider.get(request);
		int p30Val = i107Provider.get(request);
		int p31Val = i108Provider.get(request);
		int p32Val = i113Provider.get(request);
		int p33Val = i114Provider.get(request);
		int p34Val = i116Provider.get(request);
		int p35Val = i119Provider.get(request);
		int p36Val = i120Provider.get(request);
		int p37Val = i129Provider.get(request);
		int p38Val = i134Provider.get(request);
		int p39Val = i136Provider.get(request);
		int p40Val = i138Provider.get(request);
		int p41Val = i139Provider.get(request);
		int p42Val = i140Provider.get(request);
		int p43Val = i142Provider.get(request);
		int p44Val = i143Provider.get(request);
		int p45Val = i148Provider.get(request);
		int p46Val = i149Provider.get(request);
		int p47Val = i152Provider.get(request);
		int p48Val = i157Provider.get(request);
		int p49Val = i158Provider.get(request);
		int p50Val = i159Provider.get(request);
		int p51Val = i160Provider.get(request);
		int p52Val = i163Provider.get(request);
		int p53Val = i165Provider.get(request);
		int p54Val = i166Provider.get(request);
		int p55Val = i167Provider.get(request);
		int p56Val = i169Provider.get(request);
		int p57Val = i170Provider.get(request);
		int p58Val = i172Provider.get(request);
		int p59Val = i173Provider.get(request);
		
        try {
            Thread.sleep(53);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p60Val = i175Provider.get(request);
		int p61Val = i178Provider.get(request);
		int p62Val = i181Provider.get(request);
		int p63Val = i182Provider.get(request);
		int p64Val = i186Provider.get(request);
		int p65Val = i194Provider.get(request);
		
        try {
            Thread.sleep(59);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(26);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p66Val = i197Provider.get(request);

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
				p66Val;
    }
}
